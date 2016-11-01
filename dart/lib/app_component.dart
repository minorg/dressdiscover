import 'package:angular2/core.dart';
import 'package:angular2/router.dart';

import 'wizard_component.dart';

@Component(
    directives: const [ROUTER_DIRECTIVES, WizardComponent],
    providers: const [ROUTER_PROVIDERS],
    selector: 'my-app',
    styleUrls: const ['app_component.css'],
    templateUrl: 'app_component.html')
@RouteConfig(const [
  const Route(path: '/wizard', name: 'Wizard', component: WizardComponent, useAsDefault: true)
])
class AppComponent {}
