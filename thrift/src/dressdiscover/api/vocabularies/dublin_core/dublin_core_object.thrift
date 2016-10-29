namespace * dressdiscover.api.vocabularies.dublin_core

struct DublinCoreObject {
    // @validation {"minLength": 1}
    24: optional list<string> abstract_;

    // @validation {"minLength": 1}
    1: optional list<string> audience;

    // @validation {"minLength": 1}
    2: optional list<string> contributor;

    // @validation {"minLength": 1}
    3: optional list<string> coverage;

    // @validation {"minLength": 1}
    20: optional list<string> created;

    // @validation {"minLength": 1}
    4: optional list<string> creator;

    // @validation {"minLength": 1}
    5: optional list<string> date;

    // @validation {"minLength": 1}
    6: optional list<string> description;

    // @validation {"minLength": 1}
    19: optional list<string> extent;

    // @validation {"minLength": 1}
    8: optional list<string> format;

    // @validation {"minLength": 1}
    7: optional list<string> identifier;

    // @validation {"minLength": 1}
    9: optional list<string> language;

    // @validation {"minLength": 1}
    23: optional list<string> medium;

    // @validation {"minLength": 1}
    10: optional list<string> provenance;

    // @validation {"minLength": 1}
    11: optional list<string> publisher;

    // @validation {"minLength": 1}
    12: optional list<string> relation;

    // @validation {"minLength": 1}
    13: optional list<string> rights;

    // @validation {"minLength": 1}
    14: optional list<string> rights_holder;

    // @validation {"minLength": 1}
    15: optional list<string> source;

    // @validation {"minLength": 1}
    21: optional list<string> spatial;

    // @validation {"minLength": 1}
    16: optional list<string> subject;

    // @validation {"minLength": 1}
    22: optional list<string> temporal;

    // @validation {"minLength": 1}
    17: optional list<string> title;

    // @validation {"minLength": 1}
    18: optional list<string> type;
}