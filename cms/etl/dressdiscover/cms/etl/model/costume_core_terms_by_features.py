from dressdiscover.cms.etl.model.costume_core_terms import COSTUME_CORE_TERMS

COSTUME_CORE_TERMS_BY_FEATURES = {}
for costume_core_term in COSTUME_CORE_TERMS:
    if costume_core_term.features:
        COSTUME_CORE_TERMS_BY_FEATURES.setdefault(costume_core_term.features, []).append(costume_core_term)
