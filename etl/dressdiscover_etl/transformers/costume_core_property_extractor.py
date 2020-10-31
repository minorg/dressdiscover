import logging
from typing import Optional, Tuple

from paradicms_etl.models.property import Property
from rdflib import URIRef
import textacy.extract

from dressdiscover_etl.costume_core import CostumeCore


class CostumeCorePropertyExtractor:
    """
    Extract Costume Core terms from freetext.
    """

    def __init__(self, costume_core: Optional[CostumeCore] = None):
        import spacy

        self.__logger = logging.getLogger(self.__class__.__name__)
        self.__spacy = spacy.load("en_core_web_sm")

        if costume_core is None:
            costume_core = CostumeCore()
        self.__costume_core = costume_core

        terms_by_label = {}
        for term in costume_core.terms:
            terms_by_label[term.label.lower()] = term
            noun_chunks = self.__spacy(term.label)
            if len(noun_chunks) != 1:
                self.__logger.debug("term has more than one noun chunk: %s", term.label)
                continue
            noun_chunk = noun_chunks[0]
            terms_by_label[noun_chunk.text.lower()] = term
            terms_by_label[noun_chunk.lemma_.lower()] = term
        self.__terms_by_label = terms_by_label

    def extract_candidates_from_text(self, text: str) -> Tuple[str, ...]:
        sentence = self.__spacy(text)
        candidates = set()
        for noun_chunk in sentence.noun_chunks:
            candidates.add(noun_chunk.text.lower())
            candidates.add(noun_chunk.lemma_.lower())
        for token in sentence:
            if token.pos_ != "NOUN":
                continue
            candidates.add(token.text.lower())
            candidates.add(token.lemma_.lower())
        for n in (2, 3):
            for ngram in textacy.extract.ngrams(
                sentence, n, filter_nums=True, filter_punct=True, filter_stops=True
            ):
                candidates.add(repr(ngram).lower())
        return tuple(candidates)

    def extract_properties_from_candidate(self, candidate: str) -> Tuple[Property, ...]:
        term = self.__terms_by_label.get(candidate)
        if term is None:
            self.__logger.debug("unrecognized candidate: %s", candidate)
            return ()
        if term.features is None:
            return ()
        properties = []
        for predicate_id in term.features:
            if predicate_id == "workType":
                continue
            predicate = self.__costume_core.predicates_by_id[predicate_id]
            properties.append(Property(URIRef(predicate.uri), term.label))
        return tuple(properties)

    def extract_properties_from_candidates(
        self, candidates: Tuple[str, ...]
    ) -> Tuple[Property, ...]:
        properties = set()
        for candidate in candidates:
            for property_ in self.extract_properties_from_candidate(candidate):
                properties.add(property_)
        return tuple(properties)

    def extract_properties_from_text(self, text: str) -> Tuple[Property, ...]:
        return self.extract_properties_from_candidates(
            self.extract_candidates_from_text(text)
        )
