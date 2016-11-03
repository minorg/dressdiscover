class WizardFeatureType {
  static const ENUM = const WizardFeatureType("ENUM", 0);
  static const TEXT = const WizardFeatureType("TEXT", 1);
  final String name;
  final int value;

  static get enumerators => [ENUM, TEXT];

  const WizardFeatureType(this.name, this.value);

  factory WizardFeatureType.fromName(String name) {
    switch (name) {
    case "ENUM": return ENUM;
    case "TEXT": return TEXT;
    }
  }

  String toString() {
    return name;
  }
}
