import 'dart:convert' show JSON;

class IoException {
  String causeMessage;

  IoException({String causeMessage}) : causeMessage = causeMessage;

  IoException.fromJson(String json) : this.fromMap(JSON.decode(json));

  IoException.fromMap(Map<String, Object> map) {
    if (map["cause_message"] != null) {
      this.causeMessage = map["cause_message"];
    } else {
      throw new Exception("missing cause_message");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["cause_message"] = this.causeMessage;
    return map;
  }
}
