@HtmlImport('main_app.html')
library dressdiscover.main_app;

import 'feature_navigation.dart'; // ignore: unused_import
import 'package:polymer_elements/paper_icon_button.dart';
import 'package:polymer/polymer.dart';
import 'package:web_components/web_components.dart' show HtmlImport;

@PolymerRegister('main-app')
class MainApp extends PolymerElement {
  /// Constructor used to create instance of MainApp.
  MainApp.created() : super.created();

  @reflectable
  void toggleDrawer([_, __]) {
  }
}
