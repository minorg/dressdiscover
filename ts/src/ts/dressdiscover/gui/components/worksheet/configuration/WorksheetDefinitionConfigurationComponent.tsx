import {
    BundledWorksheetDefinitionConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/bundled_worksheet_definition_configuration';
import {
    WorksheetDefinitionConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/worksheet_definition_configuration';
import * as React from 'react';
import { Form, FormGroup, Input, Label } from 'reactstrap';

interface Props {
    onChange: (newWorksheetDefinitionConfiguration: WorksheetDefinitionConfiguration) => void;
    worksheetDefinitionConfiguration: WorksheetDefinitionConfiguration;
}

enum WorksheetDefinitionConfigurationType {
    BUNDLED = "bundled"
}

export class WorksheetDefinitionConfigurationComponent extends React.Component<Props> {
    constructor(props: Props) {
        super(props);
        this.onChangeType = this.onChangeType.bind(this);
    }

    onChangeType(changeEvent: React.ChangeEvent<HTMLInputElement>) {
        const newValue = changeEvent.target.value;
        if (newValue === WorksheetDefinitionConfigurationType.BUNDLED) {
            this.props.onChange(new WorksheetDefinitionConfiguration({ bundled: new BundledWorksheetDefinitionConfiguration() }));
        } else {
            throw new RangeError();
        }
    }

    render() {
        const { worksheetDefinitionConfiguration } = this.props;

        return (
            <Form>
                <FormGroup check>
                    <Label check>
                        <Input type="radio" checked={!!worksheetDefinitionConfiguration && !!worksheetDefinitionConfiguration.bundled} onChange={this.onChangeType} name="type" value={WorksheetDefinitionConfigurationType.BUNDLED} />{' '}Bundled
                    </Label>
                </FormGroup>
            </Form>
        );
    }
}