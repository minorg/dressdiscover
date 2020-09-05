export interface WorksheetStateMark {
  readonly worksheetStateId: string;
  readonly featureId?: string;
  readonly featureSetId?: string;
  readonly review?: boolean;
}
