import 'dart:convert' show JSON;
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureDefinition.dart';

class WizardFeatureSetDefinition {
  String displayName;
  Map<String, WizardFeatureDefinition> features;

  WizardFeatureSetDefinition({String displayName, Map<String, WizardFeatureDefinition> features}) : displayName = displayName, features = features;

  WizardFeatureSetDefinition.fromJson(String json) : this.fromMap(JSON.decode(json));

  WizardFeatureSetDefinition.fromMap(Map<String, Object> map) {
    if (map["display_name"] != null) {
      this.displayName = map["display_name"];
    } else {
      throw new Exception("missing display_name");
    }
    if (map["features"] != null) {
      this.features = new Map<String, WizardFeatureDefinition>.fromIterable((map["features"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureDefinition.fromMap((map["features"] as Map)[key_]));
    } else {
      throw new Exception("missing features");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["display_name"] = this.displayName;
    map["features"] = this.features;
    return map;
  }
}
