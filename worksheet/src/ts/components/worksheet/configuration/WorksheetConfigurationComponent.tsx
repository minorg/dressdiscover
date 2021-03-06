import * as classnames from "classnames";
import {WorksheetConfiguration} from "~/models/worksheet/configuration/WorksheetConfiguration";
import {WorksheetDefinitionConfiguration} from "~/models/worksheet/configuration/WorksheetDefinitionConfiguration";
import {WorksheetStateConfiguration} from "~/models/worksheet/configuration/WorksheetStateConfiguration";
import {WorksheetDefinitionConfigurationComponent} from "~/components/worksheet/configuration/WorksheetDefinitionConfigurationComponent";
import {WorksheetStateConfigurationComponent} from "~/components/worksheet/configuration/WorksheetStateConfigurationComponent";
import {History} from "history";
import * as React from "react";
import {Nav, NavItem, NavLink, TabPane} from "reactstrap";
import TabContent from "reactstrap/lib/TabContent";

enum ActiveTab {
  DEFINITIONS,
  STATE,
}

interface Props {
  history: History;
  onChange: (newWorksheetConfiguration: WorksheetConfiguration) => void;
  worksheetConfiguration: WorksheetConfiguration;
}

interface State {
  activeTab: ActiveTab;
}

export class WorksheetConfigurationComponent extends React.Component<
  Props,
  State
> {
  constructor(props: Props) {
    super(props);
    this.onChangeWorksheetDefinitionConfiguration = this.onChangeWorksheetDefinitionConfiguration.bind(
      this
    );
    this.onChangeWorksheetStateConfiguration = this.onChangeWorksheetStateConfiguration.bind(
      this
    );
    this.state = {activeTab: ActiveTab.STATE};
  }

  onChangeWorksheetDefinitionConfiguration(
    newWorksheetDefinitionConfiguration: WorksheetDefinitionConfiguration
  ) {
    this.props.onChange({
      definition: newWorksheetDefinitionConfiguration,
      state: this.props.worksheetConfiguration.state,
    });
  }

  onChangeWorksheetStateConfiguration(
    newWorksheetStateConfiguration: WorksheetStateConfiguration
  ) {
    this.props.onChange({
      definition: this.props.worksheetConfiguration.definition,
      state: newWorksheetStateConfiguration,
    });
  }

  render() {
    const {activeTab} = this.state;
    const {worksheetConfiguration} = this.props;

    const setActiveTab = (newActiveTab: ActiveTab) => {
      this.setState((prevState) => ({activeTab: newActiveTab}));
    };

    return (
      <div>
        <Nav tabs>
          <NavItem>
            <NavLink
              className={classnames({
                active: activeTab === ActiveTab.DEFINITIONS,
              })}
              onClick={() => setActiveTab(ActiveTab.DEFINITIONS)}
            >
              Definitions
            </NavLink>
          </NavItem>
          <NavItem>
            <NavLink
              className={classnames({active: activeTab === ActiveTab.STATE})}
              onClick={() => setActiveTab(ActiveTab.STATE)}
            >
              Storage
            </NavLink>
          </NavItem>
        </Nav>
        <br />
        <TabContent activeTab={activeTab}>
          <TabPane
            className={classnames({
              active: activeTab === ActiveTab.DEFINITIONS,
            })}
            tabId={ActiveTab.DEFINITIONS}
          >
            <WorksheetDefinitionConfigurationComponent
              onChange={this.onChangeWorksheetDefinitionConfiguration}
              worksheetDefinitionConfiguration={
                worksheetConfiguration.definition
              }
            ></WorksheetDefinitionConfigurationComponent>
          </TabPane>
          <TabPane
            className={classnames({active: activeTab === ActiveTab.STATE})}
            tabId={ActiveTab.STATE}
          >
            <WorksheetStateConfigurationComponent
              history={this.props.history}
              onChange={this.onChangeWorksheetStateConfiguration}
              worksheetStateConfiguration={worksheetConfiguration.state}
            ></WorksheetStateConfigurationComponent>
          </TabPane>
        </TabContent>
      </div>
    );
  }
}
