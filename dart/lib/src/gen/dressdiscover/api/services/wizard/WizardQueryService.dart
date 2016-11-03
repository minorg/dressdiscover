import 'dart:convert' show JSON;
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureSetDefinition.dart';
import 'package:dressdiscover/src/gen/dressdiscover/api/models/wizard/WizardFeatureSetState.dart';

class GetWizardFeatureSetDefinitionsRequest {
  GetWizardFeatureSetDefinitionsRequest.fromJson(String json) : this.fromMap(JSON.decode(json));

  GetWizardFeatureSetDefinitionsRequest.fromMap(Map<String, Object> map) {
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    return map;
  }
}

class GetWizardFeatureSetDefinitionsResponse {
  Map<String, WizardFeatureSetDefinition> returnValue;

  GetWizardFeatureSetDefinitionsResponse({Map<String, WizardFeatureSetDefinition> returnValue}) : returnValue = returnValue;

  GetWizardFeatureSetDefinitionsResponse.fromJson(String json) : this.fromMap(JSON.decode(json));

  GetWizardFeatureSetDefinitionsResponse.fromMap(Map<String, Object> map) {
    if (map["return_value"] != null) {
      this.returnValue = new Map<String, WizardFeatureSetDefinition>.fromIterable((map["return_value"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureSetDefinition.fromMap((map["return_value"] as Map)[key_]));
    } else {
      throw new Exception("missing return_value");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["return_value"] = this.returnValue;
    return map;
  }
}

class GetWizardFeatureSetStatesRequest {
  GetWizardFeatureSetStatesRequest.fromJson(String json) : this.fromMap(JSON.decode(json));

  GetWizardFeatureSetStatesRequest.fromMap(Map<String, Object> map) {
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    return map;
  }
}

class GetWizardFeatureSetStatesResponse {
  Map<String, WizardFeatureSetState> returnValue;

  GetWizardFeatureSetStatesResponse({Map<String, WizardFeatureSetState> returnValue}) : returnValue = returnValue;

  GetWizardFeatureSetStatesResponse.fromJson(String json) : this.fromMap(JSON.decode(json));

  GetWizardFeatureSetStatesResponse.fromMap(Map<String, Object> map) {
    if (map["return_value"] != null) {
      this.returnValue = new Map<String, WizardFeatureSetState>.fromIterable((map["return_value"] as Map).keys, key: (key_) => key_, value: (key_) => new WizardFeatureSetState.fromMap((map["return_value"] as Map)[key_]));
    } else {
      throw new Exception("missing return_value");
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["return_value"] = this.returnValue;
    return map;
  }
}
