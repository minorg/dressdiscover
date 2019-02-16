import './Frame.scss';

import * as classnames from 'classnames';
import { Footer } from 'dressdiscover/gui/components/footer/Footer';
import { ActiveNavbarItem } from 'dressdiscover/gui/components/navbar/ActiveNavbarItem';
import Navbar from 'dressdiscover/gui/components/navbar/Navbar';
import { Environment } from 'dressdiscover/gui/Environment';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import DevTools from 'mobx-react-devtools';
import * as React from 'react';
import { ReactNode } from 'react';

interface Props {
  activeNavItem?: ActiveNavbarItem;
  className?: string;
  currentUserStore?: CurrentUserStore;
  children?: ReactNode;
  id: string;
}

@inject("currentUserStore")
export class Frame extends React.Component<Props> {
  componentDidMount() {
    const { currentUserStore } = this.props;
    currentUserStore!.checkCurrentUserSession();
  }

  render() {
    return (
      <div className={classnames(["frame", this.props.className])} id={this.props.id}>
        <Navbar activeNavItem={this.props.activeNavItem} />
        {this.props.children}
        <Footer />
        {Environment.development ? <DevTools /> : null}
      </div>
    );
  }
}
