import * as classnames from 'classnames';
import { WorksheetConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_configuration';
import * as React from 'react';
import { Nav, NavItem, NavLink, TabPane } from 'reactstrap';
import TabContent from 'reactstrap/lib/TabContent';

enum ActiveTab {
    DEFINITIONS,
    STATE
}

interface Props {
    onChange: (newWorksheetConfiguration: WorksheetConfiguration) => void;
    worksheetConfiguration?: WorksheetConfiguration;
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

        const setActiveTab = (newActiveTab: ActiveTab) => { this.setState((prevState) => ({ activeTab: newActiveTab })); };

        return (
            <div>
                <Nav tabs>
                    <NavItem>
                        <NavLink
                            className={classnames({ active: activeTab === ActiveTab.DEFINITIONS })}
                            onClick={() => setActiveTab(ActiveTab.DEFINITIONS)}
                        >
                            Definitions
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink
                            className={classnames({ active: activeTab === ActiveTab.STATE })}
                            onClick={() => setActiveTab(ActiveTab.STATE)}
                        >
                            Worksheets
                        </NavLink>
                    </NavItem>
                </Nav>
                <TabContent activeTab={activeTab}>
                    <TabPane tabId={ActiveTab.DEFINITIONS}>
                        Definitions tab
                    </TabPane>
                    <TabPane tabId={ActiveTab.STATE}>
                        State tab
                    </TabPane>
                </TabContent>
            </div>
        );
    }
}
