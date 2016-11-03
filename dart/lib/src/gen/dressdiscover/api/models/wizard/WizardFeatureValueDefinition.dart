import 'dart:convert' show JSON;

class WizardFeatureValueDefinition {
  String displayName;

  WizardFeatureValueDefinition({String displayName}) : displayName = displayName;

  WizardFeatureValueDefinition.fromJson(String json) : this.fromMap(JSON.decode(json));

  WizardFeatureValueDefinition.fromMap(Map<String, Object> map) {
    if (map["display_name"] != null) {
      this.displayName = map["display_name"];
    } else {
      throw new Exception("missing display_name");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["display_name"] = this.displayName;
    return map;
  }
}
