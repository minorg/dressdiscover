import 'dart:convert' show JSON;
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureSetState.dart';

abstract class WizardCommandService {
  void put_wizard_feature_set_states({Map<String, WizardFeatureSetState> wizardFeatureSetStates});
}

class PutWizardFeatureSetStatesRequest {
  Map<String, WizardFeatureSetState> wizardFeatureSetStates;

  PutWizardFeatureSetStatesRequest({Map<String, WizardFeatureSetState> wizardFeatureSetStates}) : wizardFeatureSetStates = wizardFeatureSetStates;

  PutWizardFeatureSetStatesRequest.fromJson(String json) : this.fromMap(JSON.decode(json));

  PutWizardFeatureSetStatesRequest.fromMap(Map<String, Object> map) {
    if (map["wizard_feature_set_states"] != null) {
      this.wizardFeatureSetStates = new Map<String, WizardFeatureSetState>.fromIterable((map["wizard_feature_set_states"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureSetState.fromMap((map["wizard_feature_set_states"] as Map)[key_]));
    } else {
      throw new Exception("missing wizard_feature_set_states");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["wizard_feature_set_states"] = this.wizardFeatureSetStates;
    return map;
  }
}

class PutWizardFeatureSetStatesResponse {
  PutWizardFeatureSetStatesResponse.fromJson(String json) : this.fromMap(JSON.decode(json));

  PutWizardFeatureSetStatesResponse.fromMap(Map<String, Object> map) {
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    return map;
  }
}
