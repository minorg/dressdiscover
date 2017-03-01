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
            "58b6f5dcbfd8c5aa5d089b1f", 
            "58b6f61dbfd8c5aa5d089b20", 
            "58b6f772bfd8c5aa5d089b25", 
            "589f8f9c69cfa172fc69d28c", 
            "58b6f907bfd8c5aa5d089b27", 
            "58b6f67cbfd8c5aa5d089b22", 
            "58a9d06abfd8c5aa5d089b1d", 
            "58a9d264bfd8c5aa5d089b1e", 
            "58b6fa13bfd8c5aa5d089b2a", 
            "58b6fb78bfd8c5aa5d089b36", 
            "58b6fbf8bfd8c5aa5d089b37", 
            "58b6fc42bfd8c5aa5d089b3c", 
            "58b6f738bfd8c5aa5d089b24", 
            "58b6fa8cbfd8c5aa5d089b2f", 
            "58b6fab7bfd8c5aa5d089b30", 
            "58b6f646bfd8c5aa5d089b21"
        ], 
        "id": "589f8edd69cfa172fc69d28b", 
        "title": "Material Culture"
    }
];

var QUESTIONS = [
    {
        "text": "Why have you chosen this object?", 
        "type_": "TEXT", 
        "id": "58b6f5dcbfd8c5aa5d089b1f"
    }, 
    {
        "text": "What do you think this object is? What evidence or features of the object did you use to decide?", 
        "type_": "TEXT", 
        "id": "58b6f61dbfd8c5aa5d089b20"
    }, 
    {
        "text": "What was the most significant thing you noticed about the object?", 
        "type_": "TEXT", 
        "id": "58b6f772bfd8c5aa5d089b25"
    }, 
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
        "text": "What color(s) is the object?", 
        "type_": "COLORS", 
        "id": "58b6f907bfd8c5aa5d089b27"
    }, 
    {
        "text": "What material do you think the object is made out of?", 
        "type_": "TEXT", 
        "id": "58b6f67cbfd8c5aa5d089b22"
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
        "text": "Where do you think the object comes from?", 
        "type_": "TEXT", 
        "id": "58a9d264bfd8c5aa5d089b1e"
    }, 
    {
        "text": "Would the object belong to a man, a woman, or a child?", 
        "type_": "SELECT_MULTIPLE", 
        "values": [
            {
                "text": "Man", 
                "id": "58b6fa3dbfd8c5aa5d089b2b"
            }, 
            {
                "text": "Woman", 
                "id": "58b6fa45bfd8c5aa5d089b2c"
            }, 
            {
                "text": "Child", 
                "id": "58b6fa4bbfd8c5aa5d089b2d"
            }, 
            {
                "text": "Other", 
                "id": "58b6fa54bfd8c5aa5d089b2e"
            }
        ], 
        "id": "58b6fa13bfd8c5aa5d089b2a"
    }, 
    {
        "text": "Who do you think would have worn or used the object?", 
        "type_": "TEXT", 
        "id": "58b6fb78bfd8c5aa5d089b36"
    }, 
    {
        "text": "What season would you wear this object?", 
        "type_": "SELECT_MULTIPLE", 
        "values": [
            {
                "text": "Spring", 
                "id": "58b6fbfebfd8c5aa5d089b38"
            }, 
            {
                "text": "Summer", 
                "id": "58b6fc05bfd8c5aa5d089b39"
            }, 
            {
                "text": "Fall", 
                "id": "58b6fc0bbfd8c5aa5d089b3a"
            }, 
            {
                "text": "Winter", 
                "id": "58b6fc12bfd8c5aa5d089b3b"
            }
        ], 
        "id": "58b6fbf8bfd8c5aa5d089b37"
    }, 
    {
        "text": "What time of day would you wear this object?", 
        "type_": "SELECT_MULTIPLE", 
        "values": [
            {
                "text": "Morning", 
                "id": "58b6fc48bfd8c5aa5d089b3d"
            }, 
            {
                "text": "Afternoon", 
                "id": "58b6fc52bfd8c5aa5d089b3e"
            }, 
            {
                "text": "Evening", 
                "id": "58b6fc59bfd8c5aa5d089b3f"
            }, 
            {
                "text": "Night", 
                "id": "58b6fc60bfd8c5aa5d089b40"
            }
        ], 
        "id": "58b6fc42bfd8c5aa5d089b3c"
    }, 
    {
        "text": "What sort of insight might this object give you about the environment and/or period of time it came/comes from?", 
        "type_": "TEXT", 
        "id": "58b6f738bfd8c5aa5d089b24"
    }, 
    {
        "text": "How does it make you feel when you look at it?", 
        "type_": "TEXT", 
        "id": "58b6fa8cbfd8c5aa5d089b2f"
    }, 
    {
        "text": "Do you think the object was expensive? Why?", 
        "type_": "SELECT_ONE", 
        "values": [
            {
                "text": "Very expensive", 
                "id": "58b6fb0cbfd8c5aa5d089b31"
            }, 
            {
                "text": "Expensive", 
                "id": "58b6fb17bfd8c5aa5d089b32"
            }, 
            {
                "text": "Affordable", 
                "id": "58b6fb1fbfd8c5aa5d089b33"
            }, 
            {
                "text": "Inexpensive", 
                "id": "58b6fb26bfd8c5aa5d089b34"
            }, 
            {
                "text": "Very inexpensive", 
                "id": "58b6fb2dbfd8c5aa5d089b35"
            }
        ], 
        "id": "58b6fab7bfd8c5aa5d089b30"
    }, 
    {
        "text": "Can you think of any experience that might relate to this object?", 
        "type_": "TEXT", 
        "id": "58b6f646bfd8c5aa5d089b21"
    }
];
