import { ActiveNavbarItem } from 'dressdiscover/cms/gui/components/navbar/ActiveNavbarItem';
import { Hrefs } from 'dressdiscover/cms/gui/Hrefs';
import * as React from 'react';
import { Link, RouteComponentProps, withRouter } from 'react-router-dom';
import {
  Nav,
  Navbar as BootstrapNavbar,
  NavbarBrand,
  NavItem,
  NavLink,
} from 'reactstrap';

interface Props extends RouteComponentProps {
  activeNavItem?: ActiveNavbarItem;
}

const Navbar: React.FunctionComponent<Props> = ({activeNavItem}) =>
    <div>
      <BootstrapNavbar className="py-0" color="light" light expand="md">
        <NavbarBrand href={Hrefs.home}>Collaboration Networks</NavbarBrand>
        <Nav>
          <NavItem active={activeNavItem === ActiveNavbarItem.Home}>
            <NavLink
                active={activeNavItem === ActiveNavbarItem.Home}
                tag={Link}
                to={Hrefs.home}
            >
              Home
            </NavLink>
          </NavItem>
        </Nav>
      </BootstrapNavbar>
    </div >;

export default withRouter(Navbar);
