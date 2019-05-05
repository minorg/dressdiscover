import { Frame } from 'dressdiscover/gui/components/frame/Frame';
import { ActiveNavbarItem } from 'dressdiscover/gui/components/navbar/ActiveNavbarItem';
import { Hrefs } from 'dressdiscover/gui/Hrefs';
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
        <p>Try our visual workflow for describing historic clothing artifacts on the <Link to={Hrefs.worksheetStart}>Worksheets</Link> page.</p>
        <p>We have provided a <a href={Hrefs.gettingStarted}>Getting Started guide</a> for new users.</p>
      </Frame>
    );
  }
}
