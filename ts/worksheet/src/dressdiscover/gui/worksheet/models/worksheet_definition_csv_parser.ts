import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';
import { WorksheetFeatureValueDescription } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_description';
import { WorksheetFeatureValueImage } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_image';
import { WorksheetRights } from 'dressdiscover/api/models/worksheet/worksheet_rights';
import Papa = require('papaparse');
import * as _ from 'underscore';

export class WorksheetDefinitionCsvParser {
    parseWorksheetDefinitionCsv(kwds: {
        featuresCsv: string,
        featureSetsCsv: string,
        featureValuesCsv: string
    }): WorksheetDefinition {
        return new WorksheetDefinition({
            features: this._parseFeaturesCsv(kwds.featuresCsv),
            featureSets: this._parseFeatureSetsCsv(kwds.featureSetsCsv),
            featureValues: this._parseFeatureValuesCsv(kwds.featureValuesCsv)
        });
    }

    private static _parseCsv(csv: string, csvName: string, config?: Papa.ParseConfig) {
        const parsedCsv = Papa.parse(csv, config);
        for (let error of parsedCsv.errors) {
            if (error.code === "TooFewFields") {
                continue;
            }
            throw new RangeError("error parsing " + csvName + " CSV: " + error.message);
        }
        return parsedCsv;
    }

    private static _parseDuplicateColumnRows(duplicateColumnNames: string[], rows: any[]): any[] {
        let rowI = 0;
        let header: string[] = [];
        let outRows: any[] = [];
        for (let row of rows) {
            if (rowI++ == 0) {
                header = row;
                outRows.push([]);
                continue;
            }
            let outRow: any = {};
            for (let columnI in row) {
                let columnName = header[columnI];
                if (!_.isUndefined(columnName)) {
                    columnName = columnName.trim();
                }

                let columnValue = row[columnI];
                if (!_.isUndefined(columnValue)) {
                    columnValue = columnValue.trim();
                }

                if (_.isEmpty(columnName) || _.isEmpty(columnValue)) {
                    continue;
                }

                if (_.contains(duplicateColumnNames, columnName)) {
                    if (_.isUndefined(outRow[columnName])) {
                        outRow[columnName] = [columnValue];
                    } else {
                        outRow[columnName].push(columnValue);
                    }
                } else {
                    outRow[columnName] = columnValue;
                }
            }
            outRows.push(outRow);
        }
        return outRows;
    }

    private _parseFeaturesCsv(csv: string): WorksheetFeatureDefinition[] {
        const features: WorksheetFeatureDefinition[] = [];
        const parsedCsv = WorksheetDefinitionCsvParser._parseCsv(csv, "features");
        let rows = WorksheetDefinitionCsvParser._parseDuplicateColumnRows(["value"], parsedCsv.data);
        for (var rowI = 0; rowI < rows.length; rowI++) {
            const row = rows[rowI];
            if (_.isEmpty(row)) {
                continue;
            }
            try {
                features.push(new WorksheetFeatureDefinition({
                    displayName: row["display_name"],
                    id: row["id"],
                    valueIds: row["value"]
                }));
            } catch (e) {
                if (e instanceof RangeError) {
                    throw new RangeError("feature row " + rowI + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        }
        return features;
    }

    private _parseFeatureSetsCsv(csv: any): WorksheetFeatureSetDefinition[] {
        const featureSets: WorksheetFeatureSetDefinition[] = [];
        const parsedCsv = WorksheetDefinitionCsvParser._parseCsv(csv, "feature sets");
        let rows = WorksheetDefinitionCsvParser._parseDuplicateColumnRows(["feature"], parsedCsv.data);
        for (var rowI = 0; rowI < rows.length; rowI++) {
            const row = rows[rowI];
            if (_.isEmpty(row)) {
                continue;
            }
            try {
                featureSets.push(new WorksheetFeatureSetDefinition({
                    displayName: row["display_name"],
                    featureIds: row["feature"],
                    id: row["id"]
                }));
            } catch (e) {
                if (e instanceof RangeError) {
                    console.error("feature set row " + rowI + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        }
        return featureSets;
    }

    private _parseFeatureValuesCsv(csv: string): WorksheetFeatureValueDefinition[] {
        const values: WorksheetFeatureValueDefinition[] = [];
        const parsedCsv = WorksheetDefinitionCsvParser._parseCsv(csv, "features", { header: true });;
        let rows = WorksheetDefinitionCsvParser._parseUniqueColumnRows(parsedCsv.data);
        for (var rowI = 0; rowI < rows.length; rowI++) {
            const row = rows[rowI];
            if (_.isEmpty(row)) {
                continue;
            }

            try {
                let description: WorksheetFeatureValueDescription | undefined = undefined;
                const descriptionText = row["description_text"];
                if (!_.isEmpty(descriptionText)) {
                    description = new WorksheetFeatureValueDescription({
                        rights: WorksheetDefinitionCsvParser._parseRights("description_", row, rowI),
                        text: descriptionText
                    })
                }

                let image: WorksheetFeatureValueImage | undefined = undefined;
                const imageThumbnailUrl = row["image_thumbnail_url"];
                if (!_.isEmpty(imageThumbnailUrl)) {
                    image = new WorksheetFeatureValueImage({
                        fullSizeUrl: row["image_full_size_url"],
                        rights: WorksheetDefinitionCsvParser._parseRights("image_", row, rowI),
                        thumbnailUrl: imageThumbnailUrl
                    });
                } else {
                    console.warn("feature value row " + rowI + " has no image");
                }

                const value = new WorksheetFeatureValueDefinition({
                    description: description,
                    displayName: row["display_name"],
                    image: image,
                    id: row["id"]
                });
                values.push(value);
            } catch (e) {
                if (e instanceof RangeError) {
                    throw new RangeError("feature value row " + rowI + " error: " + e.message);
                } else {
                    throw e;
                }
            }
        }
        return values;
    }

    private static _parseRights(columnNamePrefix: string, row: any, rowI: number): WorksheetRights {
        try {
            return new WorksheetRights({
                author: row[columnNamePrefix + "rights_author"],
                license: row[columnNamePrefix + "rights_license"],
                sourceName: row[columnNamePrefix + "rights_source_name"],
                sourceUrl: row[columnNamePrefix + "rights_source_url"]
            });
        } catch (e) {
            if (e instanceof RangeError) {
                throw new RangeError("feature value row " + rowI + " " + columnNamePrefix + " rights error: " + e.message);
            }
            throw e;
        }
    }

    private static _parseUniqueColumnRows(rows: any[]): any[] {
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