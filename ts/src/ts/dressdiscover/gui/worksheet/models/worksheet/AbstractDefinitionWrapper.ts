import { WorksheetDescription } from 'dressdiscover/api/models/worksheet/worksheet_description';

interface Definition<IdT> {
    description?: WorksheetDescription;
    id: IdT;
    displayName?: string;
}

export abstract class AbstractDefinitionWrapper<DefinitionT extends Definition<IdT>, IdT> {
    constructor(public readonly definition: DefinitionT) {
    }

    get description() {
        return this.definition.description;
    }

    get displayName() {
        return this.definition.displayName ? this.definition.displayName : this.definition.id.toString();
    }

    get id() {
        return this.definition.id;
    }
}
