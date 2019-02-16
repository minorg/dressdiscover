import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import {
    GoogleSheetsWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration';
import {
    LocalStorageWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/local_storage_worksheet_state_configuration';
import { WorksheetStateConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_state_configuration';
import {
    GoogleSheetsWorksheetStateConfigurationComponent,
} from 'dressdiscover/gui/components/worksheet/configuration/GoogleSheetsWorksheetStateConfigurationComponent';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Form, FormGroup, Input, Label } from 'reactstrap';

interface Props {
    currentUserStore?: CurrentUserStore;
    onChange: (newWorksheetStateConfiguration: WorksheetStateConfiguration) => void;
    worksheetStateConfiguration: WorksheetStateConfiguration;
}

interface State {
    selectedType: WorksheetStateConfigurationType;
}

enum WorksheetStateConfigurationType {
    GOOGLE_SHEETS = "googleSheets",
    LOCAL_STORAGE = "localStorage"
}

@inject("currentUserStore")
export class WorksheetStateConfigurationComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.onChangeGoogleSheetsWorksheetStateConfiguration = this.onChangeGoogleSheetsWorksheetStateConfiguration.bind(this);
        this.onChangeWorksheetStateConfigurationType = this.onChangeWorksheetStateConfigurationType.bind(this);
        this.state = { selectedType: WorksheetStateConfigurationType.LOCAL_STORAGE };
        this.setStateFromProps(props, true);
    }

    componentWillReceiveProps(props: Props) {
        this.setStateFromProps(props, false);
    }

    onChangeGoogleSheetsWorksheetStateConfiguration(newGoogleSheetsWorksheetStateConfiguration: GoogleSheetsWorksheetStateConfiguration) {
        this.props.onChange(new WorksheetStateConfiguration({ googleSheets: newGoogleSheetsWorksheetStateConfiguration }));
            // Should propagate back to set selectedType via props.
        }

    onChangeWorksheetStateConfigurationType(changeEvent: React.ChangeEvent<HTMLInputElement>) {
        const newValue = changeEvent.target.value;
        if (newValue === WorksheetStateConfigurationType.GOOGLE_SHEETS) {
            // Don't call onChange until the sub-configuration is valid.
            this.setState((prevState) => ({ selectedType: WorksheetStateConfigurationType.GOOGLE_SHEETS }));
        } else if (newValue === WorksheetStateConfigurationType.LOCAL_STORAGE) {
            // Sub-configuration is already valid, call onChange.
            this.props.onChange(new WorksheetStateConfiguration({ localStorage: new LocalStorageWorksheetStateConfiguration() }));
            // Should propagate back to set selectedType via props.
        } else {
            throw new RangeError();
        }
    }

    render() {
        const { currentUserStore, worksheetStateConfiguration } = this.props;
        const { selectedType } = this.state;
        const currentUser = currentUserStore!.currentUser;
        const googleEnabled: boolean = !!currentUser && currentUser.identityProvider === UserIdentityProvider.GOOGLE_OAUTH2;

        return (
            <React.Fragment>
                <Form>
                    <FormGroup check>
                        <Label check>
                            <Input type="radio" checked={selectedType === WorksheetStateConfigurationType.LOCAL_STORAGE} onChange={this.onChangeWorksheetStateConfigurationType} name="type" value={WorksheetStateConfigurationType.LOCAL_STORAGE} />{' '}Local storage (tied to the browser / machine)
                    </Label>
                    </FormGroup>
                    {googleEnabled ?
                        (
                            <FormGroup check>
                                <Label check>
                                    <Input type="radio" checked={selectedType === WorksheetStateConfigurationType.GOOGLE_SHEETS} onChange={this.onChangeWorksheetStateConfigurationType} name="type" value={WorksheetStateConfigurationType.GOOGLE_SHEETS} />{' '}Google Sheets
                        </Label>
                            </FormGroup>
                        ) : null}
                </Form>
                {
                    (googleEnabled && selectedType === WorksheetStateConfigurationType.GOOGLE_SHEETS) ?
                        <GoogleSheetsWorksheetStateConfigurationComponent
                            currentUser={currentUser as CurrentUser}
                            googleSheetsWorksheetStateConfiguration={worksheetStateConfiguration.googleSheets}
                            onChange={this.onChangeGoogleSheetsWorksheetStateConfiguration}
                        />
                        : null
                }
            </React.Fragment>
        );
    }

    private setStateFromProps(props: Props, initial: boolean) {
        const { worksheetStateConfiguration } = props;
        let selectedType: WorksheetStateConfigurationType;
        if (worksheetStateConfiguration.googleSheets) {
            selectedType = WorksheetStateConfigurationType.GOOGLE_SHEETS;
        } else if (worksheetStateConfiguration.localStorage) {
            selectedType = WorksheetStateConfigurationType.LOCAL_STORAGE;
        } else {
            throw new RangeError();
        }
        if (initial) {
            this.state = { selectedType };
        } else {
            this.setState({ selectedType });
        }
    }
}