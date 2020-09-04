import { WorksheetDescription } from 'dressdiscover/gui/models/worksheet/definition/worksheet_description';

interface Definition<IdT> {
    description?: WorksheetDescription;
    displayNameEn: string;
    id: IdT;
}

export abstract class AbstractDefinitionWrapper<DefinitionT extends Definition<IdT>, IdT> {
    constructor(public readonly definition: DefinitionT) {
    }

    get description() {
        return this.definition.description;
    }

    get displayName() {
        return this.definition.displayNameEn;
    }

    get id() {
        return this.definition.id;
    }
}
