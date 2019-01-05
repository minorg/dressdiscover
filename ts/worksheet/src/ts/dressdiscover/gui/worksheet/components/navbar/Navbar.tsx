import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import { CurrentUserStore } from 'dressdiscover/gui/worksheet/stores/current_user/CurrentUserStore';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import { Link, RouteComponentProps, withRouter } from 'react-router-dom';
import { Nav, Navbar as BootstrapNavbar, NavbarBrand, NavItem, NavLink } from 'reactstrap';

import { ActiveNavbarItem } from './ActiveNavbarItem';

interface Props extends RouteComponentProps {
  activeNavItem?: ActiveNavbarItem;
  currentUserStore?: CurrentUserStore;
}

@inject('currentUserStore')
@observer
class Navbar extends React.Component<Props> {
  // componentDidMount() {
  //   this.props.currentUserStore!.fetchCurrentUser();
  // }

  async onClickLogout() {
    // await this.props.currentUserStore!.logoutCurrentUser();
    this.props.history.push(Hrefs.logoutSuccess);
  }

  render() {
    // const currentUser = this.props.currentUserStore!.currentUser;
    // let authenticatedNavItems: React.ReactNode;
    // let currentUserJsx: React.ReactNode;
    // if (currentUser) {
    //   authenticatedNavItems = (
    //     <NavItem active={this.props.activeNavItem === ActiveNavbarItem.Collaboratives}>
    //       <NavLink
    //         active={this.props.activeNavItem === ActiveNavbarItem.Collaboratives}
    //         tag={Link}
    //         to={Hrefs.collaboratives()}
    //       >
    //         Collaboratives
    //       </NavLink>
    //     </NavItem>
    //   );
    //   currentUserJsx = (
    //     <UncontrolledDropdown nav inNavbar>
    //       <DropdownToggle nav caret>
    //         {currentUser.name}
    //       </DropdownToggle>
    //       <DropdownMenu right>
    //         <DropdownItem onClick={this.onClickLogout.bind(this)}>Logout</DropdownItem>
    //       </DropdownMenu>
    //     </UncontrolledDropdown>
    //   );
    // } else {
      // authenticatedNavItems = null;
      // currentUserJsx = (
      //   <NavItem active={this.props.activeNavItem === ActiveNavbarItem.Login}>
      //     <NavLink active={this.props.activeNavItem === ActiveNavbarItem.Login} href={Hrefs.login}>
      //       Login
      //     </NavLink>
      //   </NavItem>
      // );
    // }

    return (
      <div>
        <BootstrapNavbar className="ml-2 mr-2" color="light" light expand="md">
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
          {/* <Collapse navbar>
            <Nav className="ml-auto" navbar>
              {currentUserJsx}
            </Nav>
          </Collapse> */}
        </BootstrapNavbar>
      </div>
    );
  }
}

export default withRouter(Navbar);
