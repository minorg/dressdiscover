export class StateMark {
    constructor(kwds: {
        featureId?: string,
        featureSetId?: string,
        review?: boolean,
        worksheetStateId: string
    }) {
        this.featureId = kwds.featureId;
        this.featureSetId = kwds.featureSetId;
        this.review = kwds.review;
        this.worksheetStateId = kwds.worksheetStateId;
    }

    readonly featureId: string | undefined;
    readonly featureSetId: string | undefined;
    readonly review: boolean | undefined;
    readonly worksheetStateId: string;
}