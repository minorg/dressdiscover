import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetDescription } from 'dressdiscover/api/models/worksheet/definition/worksheet_description';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_definition';
import {
    WorksheetFeatureSetDefinition,
} from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_set_definition';
import {
    WorksheetFeatureValueDefinition,
} from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_value_definition';
import { WorksheetFeatureValueImage } from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_value_image';
import {
    WorksheetFeatureValueImageUrl,
} from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_value_image_url';
import { WorksheetRights } from 'dressdiscover/api/models/worksheet/definition/worksheet_rights';
import { WorksheetRightsLicense } from 'dressdiscover/api/models/worksheet/definition/worksheet_rights_license';
import { WorksheetRightsSource } from 'dressdiscover/api/models/worksheet/definition/worksheet_rights_source';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import * as _ from 'lodash';
import * as Papa from 'papaparse';

interface CsvRowObjectType {
    [index: string]: string | string[];
}

interface RightsLicensesByUri {
    [index: string]: WorksheetRightsLicense;
}

export class WorksheetDefinitionCsvParser {
    parseWorksheetDefinitionCsv(kwds: {
        featuresCsv: string,
        featureSetsCsv: string,
        featureValuesCsv: string,
        rightsLicensesCsv: string
    }): WorksheetDefinition {
        const rightsLicensesByUri = this._parseRightsLicensesCsv(kwds.rightsLicensesCsv);
        return new WorksheetDefinition({
            featureSets: this._parseFeatureSetsCsv(kwds.featureSetsCsv, rightsLicensesByUri),
            featureValues: this._parseFeatureValuesCsv(kwds.featureValuesCsv, rightsLicensesByUri),
            features: this._parseFeaturesCsv(kwds.featuresCsv, rightsLicensesByUri)
        });
    }

    private _parseCsv(csv: string, csvName: string, config?: Papa.ParseConfig) {
        const parsedCsv = Papa.parse(csv, config);
        for (const error of parsedCsv.errors) {
            if (error.code === "TooFewFields") {
                continue;
            }
            throw new RangeError("error parsing " + csvName + " CSV: " + error.message);
        }
        return parsedCsv;
    }

    private _parseDescription(rightsLicensesByUri: RightsLicensesByUri, row: CsvRowObjectType) {
        const descriptionTextEn = row.description_text_en as string;
        if (!_.isEmpty(descriptionTextEn)) {
            return new WorksheetDescription({
                rights: this._parseRights("description_", rightsLicensesByUri, row),
                textEn: descriptionTextEn
            });
        } else {
            return undefined;
        }
    }

    private _parseDuplicateColumnRows(duplicateColumnNames: string[], rows: any[]): CsvRowObjectType[] {
        let header: string[] = [];
        const outRows: CsvRowObjectType[] = [];
        rows.forEach((row: any[], rowI) => {
            if (rowI === 0) {
                header = row;
                outRows.push({});
                return;
            }
            const outRow: any = {};
            row.forEach((column, columnI) => {
                let columnName = header[columnI];
                if (!_.isUndefined(columnName)) {
                    columnName = columnName.trim();
                }

                let columnValue = row[columnI];
                if (!_.isUndefined(columnValue)) {
                    columnValue = columnValue.trim();
                }

                if (_.isEmpty(columnName) || _.isEmpty(columnValue)) {
                    return;
                }

                if (_.indexOf(duplicateColumnNames, columnName) !== -1) {
                    if (_.isUndefined(outRow[columnName])) {
                        outRow[columnName] = [columnValue];
                    } else {
                        outRow[columnName].push(columnValue);
                    }
                } else {
                    outRow[columnName] = columnValue;
                }
            });
            outRows.push(outRow);
        });
        return outRows;
    }

    private _parseFeaturesCsv(csv: string, rightsLicensesByUri: RightsLicensesByUri): WorksheetFeatureDefinition[] {
        const features: WorksheetFeatureDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "features");
        const rows = this._parseDuplicateColumnRows(["value"], parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }
            try {
                features.push(new WorksheetFeatureDefinition({
                    description: this._parseDescription(rightsLicensesByUri, row),
                    displayNameEn: row.display_name_en as string,
                    id: WorksheetFeatureId.parse(row.id as string),
                    valueIds: (row.value as string[]).map((id: string) => WorksheetFeatureValueId.parse(id))
                }));
            } catch (e) {
                if (e instanceof RangeError) {
                    console.error("feature row " + (rowI + 2) + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        });
        return features;
    }

    private _parseFeatureSetsCsv(csv: any, rightsLicensesByUri: RightsLicensesByUri): WorksheetFeatureSetDefinition[] {
        const featureSets: WorksheetFeatureSetDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "feature sets");
        const rows = this._parseDuplicateColumnRows(["feature"], parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }
            try {
                featureSets.push(new WorksheetFeatureSetDefinition({
                    description: this._parseDescription(rightsLicensesByUri, row),
                    displayNameEn: row.display_name_en as string,
                    featureIds: (row.feature as string[]).map((id: string) => WorksheetFeatureId.parse(id)),
                    id: WorksheetFeatureSetId.parse(row.id as string)
                }));
            } catch (e) {
                if (e instanceof RangeError) {
                    console.error("feature set row " + (rowI + 2) + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        });
        return featureSets;
    }

    private _parseFeatureValuesCsv(csv: string, rightsLicensesByUri: RightsLicensesByUri): WorksheetFeatureValueDefinition[] {
        const values: WorksheetFeatureValueDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "features", { header: true });
        const rows = this._parseUniqueColumnRows(parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }

            const valueId = row.id as string;

            try {
                let image: WorksheetFeatureValueImage | undefined;
                const imageThumbnailUrl = this._parseFeatureValueImageUrl("image_thumbnail_", row);
                if (imageThumbnailUrl) {
                    image = new WorksheetFeatureValueImage({
                        fullSizeUrl: this._parseFeatureValueImageUrl("image_full_size_", row),
                        rights: this._parseRights("image_", rightsLicensesByUri, row),
                        thumbnailUrl: imageThumbnailUrl
                    });
                } else {
                    // console.warn("feature value row " + (rowI + 2) + " (" + valueId + ") has no image");
                }

                const value = new WorksheetFeatureValueDefinition({
                    description: this._parseDescription(rightsLicensesByUri, row),
                    displayNameEn: row.display_name_en as string,
                    id: WorksheetFeatureValueId.parse(valueId),
                    image
                });
                values.push(value);
            } catch (e) {
                if (e instanceof RangeError) {
                    console.error("feature value row " + (rowI + 2) + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        });
        return values;
    }

    private _parseFeatureValueImageUrl(prefix: string, row: CsvRowObjectType): WorksheetFeatureValueImageUrl | undefined {
        const absolute = row[prefix + "url"] as string;
        if (!_.isEmpty(absolute)) {
            return new WorksheetFeatureValueImageUrl({ absolute });
        }
        const relative = row[prefix + "rel_path"] as string;
        if (!_.isEmpty(relative)) {
            return new WorksheetFeatureValueImageUrl({ relative });
        }
        return undefined;
    }

    private _parseRights(columnNamePrefix: string, rightsLicensesByUri: RightsLicensesByUri, row: CsvRowObjectType): WorksheetRights {
        try {
            const licenseUri = row[columnNamePrefix + "rights_license"] as string;
            const license = rightsLicensesByUri[licenseUri];
            if (!license) {
                throw new RangeError("missing license " + licenseUri);
            }
            return new WorksheetRights({
                author: row[columnNamePrefix + "rights_author"] as string,
                license,
                source: new WorksheetRightsSource({
                    name: row[columnNamePrefix + "rights_source_name"] as string,
                    url: row[columnNamePrefix + "rights_source_url"] as string
                })
            });
        } catch (e) {
            if (e instanceof RangeError) {
                throw new RangeError(columnNamePrefix + " rights error: " + e.message);
            } else {
                throw e;
            }
        }
    }

    private _parseRightsLicensesCsv(csv: string): RightsLicensesByUri {
        const result: RightsLicensesByUri = {};
        const rows = this._parseUniqueColumnRows(this._parseCsv(csv, "features", { header: true }).data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }

            try {
                const license = new WorksheetRightsLicense({
                    nickname: row.Nickname as string,
                    statement: row.Statement as string,
                    uri: row.URL as string
                });
                result[license.uri] = license;
            } catch (e) {
                if (e instanceof RangeError) {
                    console.error("rights licenses row " + (rowI + 2) + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        });
        return result;
    }

    private _parseUniqueColumnRows(rows: CsvRowObjectType[]): CsvRowObjectType[] {
        const outRows: CsvRowObjectType[] = [];
        for (const row of rows) {
            const outRow: CsvRowObjectType = {};
            _.forOwn(row, (columnValue, columnName) => {
                columnName = columnName.trim();
                if (!_.isUndefined(columnValue)) {
                    columnValue = (columnValue as string).trim();
                }
                if (_.isEmpty(columnName) || _.isEmpty(columnValue)) {
                    return;
                }
                outRow[columnName] = columnValue;
            });
            outRows.push(outRow);
        }
        return outRows;
    }
}