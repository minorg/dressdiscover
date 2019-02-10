import { Frame } from 'dressdiscover/gui/worksheet/components/frame/Frame';
import { ActiveNavbarItem } from 'dressdiscover/gui/worksheet/components/navbar/ActiveNavbarItem';
import * as React from 'react';
import { Link } from 'react-router-dom';

import { Hrefs } from '../../Hrefs';

export class Home extends React.Component {
  render() {
    return (
      <Frame
        activeNavItem={ActiveNavbarItem.Home}
        id="home"
      >
        Welcome to DressDiscover!
        <br /><br />
        <Link to={Hrefs.worksheetStart}>Start a new worksheet.</Link>
      </Frame>
    );
  }
}
