var OBJECTS = [
    {
        "image": {
            "thumbnail_url": "img/object/thumbnail/589f8fbe69cfa172fc69d28f.jpg", 
            "full_size_url": "img/object/full_size/589f8fbe69cfa172fc69d28f.jpg", 
            "rights": {
                "source_url": "http://images.metmuseum.org/CRDImages/ci/original/26.359a-b_front_CP4.jpg", 
                "source_name": "Metropolitan Museum of Art", 
                "license": "Public domain", 
                "author": "Metropolitan Museum of Art"
            }
        }, 
        "id": "589f8fbe69cfa172fc69d28f", 
        "question_set_ids": [
            "589f8edd69cfa172fc69d28b"
        ]
    }
];

var QUESTION_SETS = [
    {
        "question_ids": [
            "589f8f9c69cfa172fc69d28c", 
            "58a9d06abfd8c5aa5d089b1d", 
            "58a9d264bfd8c5aa5d089b1e"
        ], 
        "id": "589f8edd69cfa172fc69d28b", 
        "title": "Material Culture"
    }
];

var QUESTIONS = [
    {
        "text": "Is the object large or small?", 
        "type_": "SELECT_ONE", 
        "values": [
            {
                "text": "Large", 
                "id": "589f8fa569cfa172fc69d28d"
            }, 
            {
                "text": "Small", 
                "id": "589f8fb369cfa172fc69d28e"
            }
        ], 
        "id": "589f8f9c69cfa172fc69d28c"
    }, 
    {
        "text": "When do you think this object was made?", 
        "type_": "DATE_RANGE", 
        "id": "58a9d06abfd8c5aa5d089b1d", 
        "value_range": {
            "start": 1600, 
            "step": 10, 
            "stop": 2020
        }
    }, 
    {
        "text": "Who do you think would have worn or used this object?", 
        "type_": "TEXT", 
        "id": "58a9d264bfd8c5aa5d089b1e"
    }
];
