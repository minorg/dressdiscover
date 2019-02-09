import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import { CurrentUserStore } from 'dressdiscover/gui/worksheet/stores/current_user/CurrentUserStore';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import { Link, RouteComponentProps, withRouter } from 'react-router-dom';
import {
  Collapse,
  DropdownItem,
  DropdownMenu,
  DropdownToggle,
  Nav,
  Navbar as BootstrapNavbar,
  NavbarBrand,
  NavItem,
  NavLink,
  UncontrolledDropdown,
} from 'reactstrap';

import { Environment } from '../../Environment';
import { ActiveNavbarItem } from './ActiveNavbarItem';

interface Props extends RouteComponentProps {
  activeNavItem?: ActiveNavbarItem;
  currentUserStore?: CurrentUserStore;
}

@inject('currentUserStore')
@observer
class Navbar extends React.Component<Props> {
  constructor(props: Props) {
    super(props);
    this.onClickLogout = this.onClickLogout.bind(this);
  }

  async onClickLogout() {
    // await this.props.currentUserStore!.logoutCurrentUser();
  }

  render() {
    const currentUser = this.props.currentUserStore!.currentUser;

    let currentUserJsx: React.ReactNode;
    if (Environment.supportsLogin) {
      if (currentUser) {
        currentUserJsx = (
          <UncontrolledDropdown nav inNavbar>
            <DropdownToggle nav caret>
              {currentUser.name}
            </DropdownToggle>
            <DropdownMenu right>
              <DropdownItem onClick={this.onClickLogout}>Logout</DropdownItem>
            </DropdownMenu>
          </UncontrolledDropdown>
        );
      } else {
        currentUserJsx = (
          <NavItem>
            <NavLink href={Hrefs.login}>
              Login
            </NavLink>
          </NavItem>
        );
      }
      currentUserJsx = (
        <Collapse navbar>
          <Nav className="ml-auto" navbar>
            {currentUserJsx}
          </Nav>
        </Collapse>
      );
    } else {
      currentUserJsx = null;
    }

    return (
      <div>
        <BootstrapNavbar color="light" light expand="md">
          <NavbarBrand href={Hrefs.home}>DressDiscover Worksheet</NavbarBrand>
          <Nav>
            <NavItem active={this.props.activeNavItem === ActiveNavbarItem.Home}>
              <NavLink
                active={this.props.activeNavItem === ActiveNavbarItem.Home}
                tag={Link}
                to={Hrefs.home}
              >
                Home
              </NavLink>
            </NavItem>
            <NavItem active={this.props.activeNavItem === ActiveNavbarItem.Worksheet}>
              <NavLink
                active={this.props.activeNavItem === ActiveNavbarItem.Worksheet}
                tag={Link}
                to={Hrefs.worksheetStart}
              >
                Worksheet
              </NavLink>
            </NavItem>
            {/* {authenticatedNavItems} */}
          </Nav>
          {currentUserJsx}
        </BootstrapNavbar>
      </div>
    );
  }
}

export default withRouter(Navbar);
