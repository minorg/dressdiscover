import 'dart:convert' show JSON;

class WizardFeatureValueState {
  bool selected;
  String text;

  WizardFeatureValueState({bool selected: null, String text: null}) : selected = selected, text = text;

  WizardFeatureValueState.fromJson(String json) : this.fromMap(JSON.decode(json));

  WizardFeatureValueState.fromMap(Map<String, Object> map) {
    if (map["selected"] != null) {
      this.selected = map["selected"];
    }
    if (map["text"] != null) {
      this.text = map["text"];
    }
  }

  String toJson() {
    return JSON.encode(this.toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    if (this.selected != null) {
      map["selected"] = this.selected;
    }
    if (this.text != null) {
      map["text"] = this.text;
    }
    return map;
  }
}
