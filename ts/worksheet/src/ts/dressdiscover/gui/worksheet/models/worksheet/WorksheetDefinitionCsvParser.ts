import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetDescription } from 'dressdiscover/api/models/worksheet/worksheet_description';
import { WorksheetExtentDefinition } from 'dressdiscover/api/models/worksheet/worksheet_extent_definition';
import { WorksheetExtentId } from 'dressdiscover/api/models/worksheet/worksheet_extent_id';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import { WorksheetFeatureValueImage } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_image';
import { WorksheetRights } from 'dressdiscover/api/models/worksheet/worksheet_rights';
import * as _ from 'lodash';
import * as Papa from 'papaparse';

export class WorksheetDefinitionCsvParser {
    parseWorksheetDefinitionCsv(kwds: {
        extentsCsv: string,
        featuresCsv: string,
        featureSetsCsv: string,
        featureValuesCsv: string
    }): WorksheetDefinition {
        return new WorksheetDefinition({
            extents: this._parseExtentsCsv(kwds.extentsCsv),
            features: this._parseFeaturesCsv(kwds.featuresCsv),
            featureSets: this._parseFeatureSetsCsv(kwds.featureSetsCsv),
            featureValues: this._parseFeatureValuesCsv(kwds.featureValuesCsv)
        });
    }

    private _parseCsv(csv: string, csvName: string, config?: Papa.ParseConfig) {
        const parsedCsv = Papa.parse(csv, config);
        for (let error of parsedCsv.errors) {
            if (error.code === "TooFewFields") {
                continue;
            }
            throw new RangeError("error parsing " + csvName + " CSV: " + error.message);
        }
        return parsedCsv;
    }

    private _parseDescription(row: any) {
        const descriptionText = row["description_text"];
        if (!_.isEmpty(descriptionText)) {
            return new WorksheetDescription({
                rights: this._parseRights("description_", row),
                text: descriptionText
            })
        } else {
            return undefined;
        }
    }

    private _parseDuplicateColumnRows(duplicateColumnNames: string[], rows: any[]): any[] {
        let header: string[] = [];
        let outRows: any[] = [];
        rows.forEach((row: any[], rowI) => {
            if (rowI == 0) {
                header = row;
                outRows.push([]);
                return;
            }
            let outRow: any = {};
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

                if (_.indexOf(duplicateColumnNames, columnName) != -1) {
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

    private _parseExtentsCsv(csv: string): WorksheetExtentDefinition[] {
        const extents: WorksheetExtentDefinition[] = [];
        const parsedCsv = this._parseCsv(csv, "extents", { header: true });
        const rows = this._parseUniqueColumnRows(parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }
            try {
                extents.push(
                    new WorksheetExtentDefinition({
                        description: this._parseDescription(row),
                        displayName: row["display_name"],
                        id: WorksheetExtentId.parse(row["id"]),
                    })
                );
            } catch (e) {
                if (e instanceof RangeError) {
                    console.error("extent row " + (rowI + 2) + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        });
        return extents;
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
                    displayName: row["display_name"],
                    id: WorksheetFeatureId.parse(row["id"]),
                    valueIds: _.map(row["value"], (id: string) => WorksheetFeatureValueId.parse(id))
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
                    displayName: row["display_name"],
                    featureIds: _.map(row["feature"], (id: string) => WorksheetFeatureId.parse(id)),
                    id: WorksheetFeatureSetId.parse(row["id"])
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
        const parsedCsv = this._parseCsv(csv, "features", { header: true });;
        const rows = this._parseUniqueColumnRows(parsedCsv.data);
        rows.forEach((row, rowI) => {
            if (_.isEmpty(row)) {
                return;
            }

            const valueId = row["id"];

            try {
                let image: WorksheetFeatureValueImage | undefined = undefined;
                const imageThumbnailUrl = row["image_thumbnail_url"];
                if (!_.isEmpty(imageThumbnailUrl)) {
                    image = new WorksheetFeatureValueImage({
                        fullSizeUrl: row["image_full_size_url"],
                        rights: this._parseRights("image_", row),
                        thumbnailUrl: imageThumbnailUrl
                    });
                } else {
                    // console.warn("feature value row " + (rowI + 2) + " (" + valueId + ") has no image");
                }

                const value = new WorksheetFeatureValueDefinition({
                    description: this._parseDescription(row),
                    displayName: row["display_name"],
                    image: image,
                    id: WorksheetFeatureValueId.parse(valueId)
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
        let outRows: any[] = [];
        for (let row of rows) {
            let outRow: any = {};
            for (let columnName in row) {
                columnName = columnName.trim();
                let columnValue = row[columnName];
                if (!_.isUndefined(columnValue)) {
                    columnValue = columnValue.trim();
                }
                if (_.isEmpty(columnName) || _.isEmpty(columnValue)) {
                    continue;
                }
                outRow[columnName] = columnValue;
            }
            outRows.push(outRow);
        }
        return outRows;
    }
}