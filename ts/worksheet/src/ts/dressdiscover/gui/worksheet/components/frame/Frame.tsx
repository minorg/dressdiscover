import './Frame.scss';

import { Footer } from 'dressdiscover/gui/worksheet/components/footer/Footer';
import { ActiveNavbarItem } from 'dressdiscover/gui/worksheet/components/navbar/ActiveNavbarItem';
import Navbar from 'dressdiscover/gui/worksheet/components/navbar/Navbar';
import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import * as React from 'react';
import { ReactNode } from 'react';
import { Link } from 'react-router-dom';
import { Breadcrumb } from 'reactstrap';
import BreadcrumbItem from 'reactstrap/lib/BreadcrumbItem';

interface Props {
  activeNavItem?: ActiveNavbarItem;
  breadcrumbItems?: ReactNode;
  children?: ReactNode;
  headline: string;
  id: string;
}

export class Frame extends React.Component<Props> {
  render() {
    return (
      <div className="frame" id={this.props.id}>
        <Navbar activeNavItem={this.props.activeNavItem} />
        <h1 className="headline pb-2 pl-4 pt-2">{this.props.headline}</h1>
        <Breadcrumb className="pl-4">
          <BreadcrumbItem active={this.props.activeNavItem === ActiveNavbarItem.Home}>
            <Link to={Hrefs.home}>Home</Link>
          </BreadcrumbItem>
          {this.props.breadcrumbItems}
        </Breadcrumb>
        {this.props.children}
        <Footer/>
      </div>
    );
  }
}
