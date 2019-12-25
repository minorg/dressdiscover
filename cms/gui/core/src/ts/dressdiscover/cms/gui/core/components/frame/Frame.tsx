import './Frame.scss';

import * as classnames from 'classnames';
import {Footer} from 'dressdiscover/cms/gui/core/components/footer/Footer';
import {ActiveNavbarItem} from 'dressdiscover/cms/gui/core/components/navbar/ActiveNavbarItem';
import Navbar from 'dressdiscover/cms/gui/core/components/navbar/Navbar';
import * as React from 'react';
import {useEffect} from 'react';

export const Frame: React.FunctionComponent<{
    activeNavItem?: ActiveNavbarItem;
    className?: string;
    children: React.ReactNode;
    documentTitle: string;
}> = ({activeNavItem, className, children, documentTitle}) => {
    useEffect(() => {
        document.title = "DressDiscover CMS - " + documentTitle;
    });
    return (
        <div className={classnames(["frame", className])}>
            <Navbar activeNavItem={activeNavItem}/>
            <div className="mb-4"></div>
            {children}
            <Footer/>
            {/*{Environment.development ? <DevTools /> : null}*/}
        </div>);
}