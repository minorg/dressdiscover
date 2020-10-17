import logging
from typing import Optional, Tuple

from paradicms_etl.models.property import Property
from rdflib import URIRef

from dressdiscover_etl.models.costume_core_predicate import CostumeCorePredicate
from dressdiscover_etl.models.costume_core_predicates import COSTUME_CORE_PREDICATES
from dressdiscover_etl.models.costume_core_term import CostumeCoreTerm
from dressdiscover_etl.models.costume_core_terms import COSTUME_CORE_TERMS


class CostumeCorePropertyExtractor:
    """
    Extract Costume Core terms from freetext.
    """

    def __init__(
        self,
        predicates: Optional[Tuple[CostumeCorePredicate, ...]] = None,
        terms: Optional[Tuple[CostumeCoreTerm, ...]] = None,
    ):
        import spacy

        self.__logger = logging.getLogger(self.__class__.__name__)
        self.__spacy = spacy.load("en_core_web_sm")

        if predicates is None:
            predicates = COSTUME_CORE_PREDICATES
        self.__predicates_by_id = {predicate.id: predicate for predicate in predicates}

        if terms is None:
            terms = COSTUME_CORE_TERMS

        terms_by_label = {}
        for term in terms:
            terms_by_label[term.display_name_en.lower()] = term
            noun_chunks = self.__spacy(term.display_name_en)
            if len(noun_chunks) != 1:
                self.__logger.warning(
                    "term has more than one noun chunk: %s", term.display_name_en
                )
                continue
            noun_chunk = noun_chunks[0]
            terms_by_label[noun_chunk.text.lower()] = term
            terms_by_label[noun_chunk.lemma_.lower()] = term
        self.__terms_by_label = terms_by_label

    def extract_costume_core_properties(self, text: str) -> Tuple[Property, ...]:
        sentence = self.__spacy(text)

        nouns = set()
        for noun_chunk in sentence.noun_chunks:
            nouns.add(noun_chunk.text.lower())
            nouns.add(noun_chunk.lemma_.lower())
        for token in sentence:
            if token.pos_ != "NOUN":
                continue
            nouns.add(token.text.lower())
            nouns.add(token.lemma_.lower())
        # print(tuple(nouns))

        properties = []
        for noun in tuple(nouns):
            term = self.__terms_by_label.get(noun)
            if term is None:
                self.__logger.warning("unrecognized noun: %s", noun)
                continue
            if term.features is None:
                continue
            for predicate_id in term.features:
                if predicate_id == "workType":
                    continue
                predicate = self.__predicates_by_id[predicate_id]
                properties.append(Property(URIRef(predicate.uri), term.display_name_en))
        return tuple(properties)
