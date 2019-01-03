import { Frame } from 'dressdiscover/gui/worksheet/component/frame/Frame';
import * as React from 'react';

import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';

export class Home extends React.Component {
  render() {
    return (
      <Frame
        activeNavItem={ActiveNavbarItem.Home}
        headline="Home"
        id="home"
      >
        Welcome to CAMP!
      </Frame>
    );
  }
}
