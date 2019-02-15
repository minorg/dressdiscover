import {
    LocalStorageWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/local_storage_worksheet_state_configuration';
import { WorksheetStateConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_state_configuration';
import * as React from 'react';
import { Form, FormGroup, Input, Label } from 'reactstrap';

interface Props {
    onChange: (newWorksheetStateConfiguration: WorksheetStateConfiguration) => void;
    worksheetStateConfiguration: WorksheetStateConfiguration;
}

enum RadioValue {
    LOCAL_STORAGE = "localStorage"
}

export class WorksheetStateConfigurationComponent extends React.Component<Props> {
    constructor(props: Props) {
        super(props);
        this.onChangeType = this.onChangeType.bind(this);
    }

    onChangeType(changeEvent: React.ChangeEvent<HTMLInputElement>) {
        const newValue = changeEvent.target.value;
        if (newValue === RadioValue.LOCAL_STORAGE) {
            this.props.onChange(new WorksheetStateConfiguration({ localStorage: new LocalStorageWorksheetStateConfiguration() }));
        } else {
            throw new RangeError();
        }
    }

    render() {
        const { worksheetStateConfiguration } = this.props;

        return (
            <Form>
                <FormGroup check>
                    <Label check>
                        <Input type="radio" checked={!!worksheetStateConfiguration && !!worksheetStateConfiguration.localStorage} onChange={this.onChangeType} name="type" value={RadioValue.LOCAL_STORAGE} />{' '}Local storage (tied to the browser / machine)
                    </Label>
                </FormGroup>
            </Form>
        );
    }
}