import * as classnames from 'classnames';
import { WorksheetConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_configuration';
import * as React from 'react';
import { Nav, NavItem, NavLink } from 'reactstrap';

interface Props {
    onChange: (newWorksheetConfiguration: WorksheetConfiguration) => void;
}

enum ActiveTab {
    DEFINITIONS,
    STATE
}

interface State {
    activeTab: ActiveTab;
}

export class WorksheetConfigurationComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = { activeTab: ActiveTab.STATE };
    }

    render() {
        const { activeTab } = this.state;

        return (
            <div>
                <Nav tabs>
                    <NavItem>
                        <NavLink className={classnames({ active: activeTab === ActiveTab.DEFINITIONS })}>
                            Definitions
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink className={classnames({ active: activeTab === ActiveTab.STATE })}>
                            Worksheets
                        </NavLink>
                    </NavItem>
                </Nav>
            </div>
        );
    }
}
