import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import {
    GoogleSheetsWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration';
import { FatalErrorModal } from 'dressdiscover/gui/components/error/FatalErrorModal';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import * as invariant from 'invariant';
import * as React from 'react';
import * as ReactLoader from 'react-loader';

interface Props {
    currentUser: CurrentUser;
    googleSheetsWorksheetStateConfiguration?: GoogleSheetsWorksheetStateConfiguration;
    onChange: (newGoogleSheetsWorksheetStateConfiguration: GoogleSheetsWorksheetStateConfiguration) => void;
}

interface State {
    error?: any;
    existingFiles?: gapi.client.drive.File[];
}

export class GoogleSheetsWorksheetStateConfigurationComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = {};
    }

    componentDidMount() {
        const { currentUser } = this.props;
        invariant(currentUser.identityProvider === UserIdentityProvider.GOOGLE_OAUTH2, "unexpected identity provider");
        const accessToken = currentUser.session.accessToken;
        invariant(accessToken, "no access token set");

        gapi.client.setToken({ access_token: accessToken as string });

        gapi.client.drive.files.list({})
            .then((response) => {
                const files = response.result.files;
                this.setState((prevState) => ({ existingFiles: files ? files : [] }));
            }, (reason: any) => {
                this.setState((prevState) => ({ error: reason }));
            });
    }

    render() {
        const { error, existingFiles } = this.state;
        if (error) {
            return <FatalErrorModal message={JSON.stringify(error)}></FatalErrorModal>;
        } else if (!existingFiles) {
            return <ReactLoader loaded={false}></ReactLoader>;
        }

        return (
            <ul>
                {existingFiles.map((existingFile) =>
                    <li key={existingFile.id}>{existingFile.name}</li>
                )}
            </ul>
        )
    }
}
