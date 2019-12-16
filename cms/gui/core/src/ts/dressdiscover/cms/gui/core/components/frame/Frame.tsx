import './Frame.scss';

import * as classnames from 'classnames';
import { Footer } from 'dressdiscover/cms/gui/components/footer/Footer';
import { ActiveNavbarItem } from 'dressdiscover/cms/gui/components/navbar/ActiveNavbarItem';
import Navbar from 'dressdiscover/cms/gui/components/navbar/Navbar';
import * as React from 'react';

export const Frame: React.FunctionComponent<{
  activeNavItem?: ActiveNavbarItem;
  className?: string;
  children: React.ReactNode;
  id: string;
}> = ({activeNavItem, className, children, id}) =>
      <div className={classnames(["frame", className])} id={id}>
        <Navbar activeNavItem={activeNavItem} />
        {children}
        <Footer />
        {/*{Environment.development ? <DevTools /> : null}*/}
      </div>
