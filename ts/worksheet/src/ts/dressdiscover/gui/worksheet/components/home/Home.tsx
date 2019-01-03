import { Frame } from 'dressdiscover/gui/worksheet/components/frame/Frame';
import { ActiveNavbarItem } from 'dressdiscover/gui/worksheet/components/navbar/ActiveNavbarItem';
import * as React from 'react';

export class Home extends React.Component {
  render() {
    return (
      <Frame
        activeNavItem={ActiveNavbarItem.Home}
        headline="Home"
        id="home"
      >
        Welcome to DressDiscover Worksheet!
      </Frame>
    );
  }
}
