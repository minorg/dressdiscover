import * as classnames from "classnames";
import * as React from "react";
import {CSSProperties} from "react";
import {DisclosurePanel} from "dressdiscover/gui/components/disclosure/DisclosurePanel";

export const TextDisclosurePanel: React.FunctionComponent<{
    text: string;
    textClassName?: string;
    textStyle?: CSSProperties;
    title: string;
}> = ({text, textClassName, textStyle, title}) => (
    <DisclosurePanel title={title}>
        <div className={classnames("text-left", textClassName)} style={textStyle}>{text}</div>
    </DisclosurePanel>);
