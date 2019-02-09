import './Frame.scss';

import * as classnames from 'classnames';
import { Footer } from 'dressdiscover/gui/worksheet/components/footer/Footer';
import { ActiveNavbarItem } from 'dressdiscover/gui/worksheet/components/navbar/ActiveNavbarItem';
import Navbar from 'dressdiscover/gui/worksheet/components/navbar/Navbar';
import DevTools from 'mobx-react-devtools';
import * as React from 'react';
import { ReactNode } from 'react';

declare var DEVELOPMENT: boolean;

interface Props {
  activeNavItem?: ActiveNavbarItem;
  className?: string;
  children?: ReactNode;
  id: string;
}

export class Frame extends React.Component<Props> {
  render() {
    return (
      <div className={classnames(["frame", this.props.className])} id={this.props.id}>
        <Navbar activeNavItem={this.props.activeNavItem} />
        {this.props.children}
        <Footer />
        {DEVELOPMENT ? <DevTools /> : null}
      </div>
    );
  }
}
