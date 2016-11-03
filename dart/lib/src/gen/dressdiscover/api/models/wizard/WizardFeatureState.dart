import 'dart:convert' show JSON;
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureValueState.dart';

class WizardFeatureState {
  Map<String, WizardFeatureValueState> values;

  WizardFeatureState({Map<String, WizardFeatureValueState> values}) : values = values;

  WizardFeatureState.fromJson(String json) : this.fromMap(JSON.decode(json));

  WizardFeatureState.fromMap(Map<String, Object> map) {
    if (map["values"] != null) {
      this.values = new Map<String, WizardFeatureValueState>.fromIterable((map["values"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureValueState.fromMap((map["values"] as Map)[key_]));
    } else {
      throw new Exception("missing values");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["values"] = this.values;
    return map;
  }
}
