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
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import * as _ from 'lodash';
import * as Papa from 'papaparse';

export class WorksheetDefinitionCsvParser {
    parseWorksheetDefinitionCsv(kwds: {
        featuresCsv: string,
        featureSetsCsv: string,
        featureValuesCsv: string
    }): WorksheetDefinition {
        return new WorksheetDefinition({
            featureSets: this._parseFeatureSetsCsv(kwds.featureSetsCsv),
            featureValues: this._parseFeatureValuesCsv(kwds.featureValuesCsv),
            features: this._parseFeaturesCsv(kwds.featuresCsv)
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

    private _parseDescription(row: any) {
        const descriptionTextEn = row.description_text_en;
        if (!_.isEmpty(descriptionTextEn)) {
            return new WorksheetDescription({
                rights: this._parseRights("description_", row),
                textEn: descriptionTextEn
            });
        } else {
            return undefined;
        }
    }

    private _parseDuplicateColumnRows(duplicateColumnNames: string[], rows: any[]): any[] {
        let header: string[] = [];
        const outRows: any[] = [];
        rows.forEach((row: any[], rowI) => {
            if (rowI === 0) {
                header = row;
                outRows.push([]);
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

    private _parseFeaturesCsv(csv: string): WorksheetFeatureDefinition[] {
        const features: WorksheetFeatureDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "features");
        const rows = this._parseDuplicateColumnRows(["value"], parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }
            try {
                features.push(new WorksheetFeatureDefinition({
                    description: this._parseDescription(row),
                    displayNameEn: row.display_name_en,
                    id: WorksheetFeatureId.parse(row.id),
                    valueIds: row.value.map((id: string) => WorksheetFeatureValueId.parse(id))
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

    private _parseFeatureSetsCsv(csv: any): WorksheetFeatureSetDefinition[] {
        const featureSets: WorksheetFeatureSetDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "feature sets");
        const rows = this._parseDuplicateColumnRows(["feature"], parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }
            try {
                featureSets.push(new WorksheetFeatureSetDefinition({
                    description: this._parseDescription(row),
                    displayNameEn: row.display_name_en,
                    featureIds: row.feature.map((id: string) => WorksheetFeatureId.parse(id)),
                    id: WorksheetFeatureSetId.parse(row.id)
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

    private _parseFeatureValuesCsv(csv: string): WorksheetFeatureValueDefinition[] {
        const values: WorksheetFeatureValueDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "features", { header: true });
        const rows = this._parseUniqueColumnRows(parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }

            const valueId = row.id;

            try {
                let image: WorksheetFeatureValueImage | undefined;
                const imageThumbnailUrl = this._parseFeatureValueImageUrl("image_thumbnail_", row);
                if (imageThumbnailUrl) {
                    image = new WorksheetFeatureValueImage({
                        fullSizeUrl: this._parseFeatureValueImageUrl("image_full_size_", row),
                        rights: this._parseRights("image_", row),
                        thumbnailUrl: imageThumbnailUrl
                    });
                } else {
                    // console.warn("feature value row " + (rowI + 2) + " (" + valueId + ") has no image");
                }

                const value = new WorksheetFeatureValueDefinition({
                    description: this._parseDescription(row),
                    displayNameEn: row.display_name_en,
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

    private _parseFeatureValueImageUrl(prefix: string, row: any): WorksheetFeatureValueImageUrl | undefined {
        const absolute = row[prefix + "url"];
        if (!_.isEmpty(absolute)) {
            return new WorksheetFeatureValueImageUrl({ absolute });
        }
        const relative = row[prefix + "rel_path"];
        if (!_.isEmpty(relative)) {
            return new WorksheetFeatureValueImageUrl({ relative });
        }
        return undefined;
    }

    private _parseRights(columnNamePrefix: string, row: any): WorksheetRights {
        try {
            return new WorksheetRights({
                author: row[columnNamePrefix + "rights_author"],
                license: row[columnNamePrefix + "rights_license"],
                sourceName: row[columnNamePrefix + "rights_source_name"],
                sourceUrl: row[columnNamePrefix + "rights_source_url"]
            });
        } catch (e) {
            if (e instanceof RangeError) {
                throw new RangeError(columnNamePrefix + " rights error: " + e.message);
            } else {
                throw e;
            }
        }
    }

    private _parseUniqueColumnRows(rows: any[]): any[] {
        const outRows: any[] = [];
        for (const row of rows) {
            const outRow: any = {};
            _.forOwn(row, (columnValue, columnName) => {
                columnName = columnName.trim();
                if (!_.isUndefined(columnValue)) {
                    columnValue = columnValue.trim();
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
