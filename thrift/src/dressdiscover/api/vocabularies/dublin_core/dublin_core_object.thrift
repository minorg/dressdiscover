namespace * dressdiscover.api.vocabularies.dublin_core

struct DublinCoreObject {
    // @validation {"minLength": 1}
    1: optional list<string> audiences;

    // @validation {"minLength": 1}
    2: optional list<string> contributors;

    // @validation {"minLength": 1}
    3: optional list<string> coverages;

    // @validation {"minLength": 1}
    4: optional list<string> creators;

    // @validation {"minLength": 1}
    5: optional list<string> dates;

    // @validation {"minLength": 1}
    6: optional list<string> descriptions;

    // @validation {"minLength": 1}
    8: optional list<string> formats;

    // @validation {"minLength": 1}
    7: optional list<string> identifiers;

    // @validation {"minLength": 1}
    9: optional list<string> languages;

    // @validation {"minLength": 1}
    10: optional string provenances;

    // @validation {"minLength": 1}
    11: optional list<string> publishers;

    // @validation {"minLength": 1}
    12: optional list<string> relations;

    // @validation {"minLength": 1}
    13: optional list<string> rights;

    // @validation {"minLength": 1}
    14: optional list<string> rights_holders;

    // @validation {"minLength": 1}
    15: optional list<string> sources;

    // @validation {"minLength": 1}
    16: optional list<string> subjects;

    // @validation {"minLength": 1}
    17: optional list<string> titles;

    // @validation {"minLength": 1}
    18: optional list<string> types;
}