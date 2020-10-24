import * as classnames from "classnames";
import * as React from "react";
import {CSSProperties} from "react";
import {DisclosurePanel} from "~/components/disclosure/DisclosurePanel";

export const TextDisclosurePanel: React.FunctionComponent<{
    text: string;
    textClassName?: string;
    textStyle?: CSSProperties;
    title: string;
    toggleClassName?: string;
}> = ({text, textClassName, textStyle, title, toggleClassName}) => (
    <DisclosurePanel title={title} toggleClassName={toggleClassName}>
        <div className={classnames("text-left", textClassName)} style={textStyle}>{text}</div>
    </DisclosurePanel>);
