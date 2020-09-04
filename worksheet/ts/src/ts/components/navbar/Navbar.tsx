import { Hrefs } from '~/Hrefs';
import { CurrentUserStore } from '~/stores/current_user/CurrentUserStore';
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
  render() {
    const currentUser = this.props.currentUserStore!.currentUser;

    let currentUserJsx: React.ReactNode;
    if (Environment.supportsLogin) {
      if (currentUser && currentUser.session.isValid()) {
        currentUserJsx = (
          <UncontrolledDropdown nav inNavbar>
            <DropdownToggle nav caret>
              {currentUser.name}
            </DropdownToggle>
            <DropdownMenu right>
              <DropdownItem><Link to={Hrefs.userSettings}>Settings</Link></DropdownItem>
              <DropdownItem><Link to={Hrefs.logout}>Logout</Link></DropdownItem>
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
            <NavItem active={this.props.activeNavItem === ActiveNavbarItem.Worksheets}>
              <NavLink
                active={this.props.activeNavItem === ActiveNavbarItem.Worksheets}
                tag={Link}
                to={Hrefs.worksheetStart}
              >
                Worksheets
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
