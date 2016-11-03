import 'dart:convert' show JSON;
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureState.dart';

class WizardFeatureSetState {
  Map<String, WizardFeatureState> features;

  WizardFeatureSetState({Map<String, WizardFeatureState> features: null}) : features = features;

  WizardFeatureSetState.fromJson(String json) : this.fromMap(JSON.decode(json));

  WizardFeatureSetState.fromMap(Map<String, Object> map) {
    if (map["features"] != null) {
      this.features = new Map<String, WizardFeatureState>.fromIterable((map["features"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureState.fromMap((map["features"] as Map)[key_]));
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    if (this.features != null) {
      map["features"] = this.features;
    }
    return map;
  }
}
