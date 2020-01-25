import * as classnames from "classnames";
import {Collapse} from "reactstrap";
import * as React from "react";
import {useState} from "react";

export const DisclosurePanel: React.FunctionComponent<{
    children?: React.ReactNode;
    title: string;
}> = ({children, title}) => {
    const [state, setState] = useState<{ open: boolean }>({open: false});
    const {open} = state;
    const onToggle = () => setState((prevState) => ({open: !prevState.open}));

    return (
        <div>
            <a onClick={onToggle}>{title}</a>
            <div className="float-right">
                <a onClick={onToggle}>
                    <i className={classnames({
                        fas: true,
                        "fa-chevron-down": open,
                        "fa-chevron-right": !open
                    })}></i>
                </a>
            </div>
            <br/>
            <Collapse isOpen={open}>
                {children}
            </Collapse>
        </div>
    );
}
