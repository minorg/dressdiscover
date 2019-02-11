import { Frame } from 'dressdiscover/gui/worksheet/components/frame/Frame';
import { ActiveNavbarItem } from 'dressdiscover/gui/worksheet/components/navbar/ActiveNavbarItem';
import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import * as React from 'react';
import { Link } from 'react-router-dom';

export class Home extends React.Component {
  render() {
    return (
      <Frame
        activeNavItem={ActiveNavbarItem.Home}
        id="home"
      >
        <br/>
        <p>
          <b>DressDiscover</b> is a suite of web applications for digital collections of historic clothing.
        </p>
        <p>Read more about this project on the <Link to={Hrefs.about}>About</Link> page.</p>
      </Frame>
    );
  }
}
