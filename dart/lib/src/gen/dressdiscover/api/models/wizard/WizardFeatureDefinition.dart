import 'dart:convert' show JSON;
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureType.dart';
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureValueDefinition.dart';

class WizardFeatureDefinition {
  String displayName;
  WizardFeatureType type;
  Map<String, WizardFeatureValueDefinition> values;

  WizardFeatureDefinition({String displayName, WizardFeatureType type, Map<String, WizardFeatureValueDefinition> values: null}) : displayName = displayName, type = type, values = values;

  WizardFeatureDefinition.fromJson(String json) : this.fromMap(JSON.decode(json));

  WizardFeatureDefinition.fromMap(Map<String, Object> map) {
    if (map["display_name"] != null) {
      this.displayName = map["display_name"];
    } else {
      throw new Exception("missing display_name");
    }
    if (map["type"] != null) {
      this.type = new WizardFeatureType.fromName(map["type"]);
    } else {
      throw new Exception("missing type");
    }
    if (map["values"] != null) {
      this.values = new Map<String, WizardFeatureValueDefinition>.fromIterable((map["values"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureValueDefinition.fromMap((map["values"] as Map)[key_]));
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["display_name"] = this.displayName;
    map["type"] = this.type.name;
    if (this.values != null) {
      map["values"] = this.values;
    }
    return map;
  }
}
