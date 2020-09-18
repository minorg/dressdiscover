import {WorksheetDefinition} from "~/models/worksheet/definition/WorksheetDefinition";
import {WorksheetDescription} from "~/models/worksheet/definition/WorksheetDescription";
import {WorksheetFeatureDefinition} from "~/models/worksheet/definition/WorksheetFeatureDefinition";
import {WorksheetFeatureSetDefinition} from "~/models/worksheet/definition/WorksheetFeatureSetDefinition";
import {WorksheetFeatureValueDefinition} from "~/models/worksheet/definition/WorksheetFeatureValueDefinition";
import {WorksheetFeatureValueImage} from "~/models/worksheet/definition/WorksheetFeatureValueImage";
import {WorksheetFeatureValueImageUrl} from "~/models/worksheet/definition/WorksheetFeatureValueImageUrl";
import {WorksheetRights} from "~/models/worksheet/definition/WorksheetRights";
import {WorksheetRightsLicense} from "~/models/worksheet/definition/WorksheetRightsLicense";
import * as _ from "lodash";
import * as Papa from "papaparse";

interface CsvRowObjectType {
  [index: string]: string | string[];
}

interface RightsLicensesByUri {
  [index: string]: WorksheetRightsLicense;
}

export class WorksheetDefinitionCsvParser {
  parseWorksheetDefinitionCsv(kwds: {
    featuresCsv: string;
    featureSetsCsv: string;
    featureValuesCsv: string;
    rightsLicensesCsv: string;
  }): WorksheetDefinition {
    const rightsLicensesByUri = this._parseRightsLicensesCsv(
      kwds.rightsLicensesCsv
    );
    return {
      featureSets: this._parseFeatureSetsCsv(
        kwds.featureSetsCsv,
        rightsLicensesByUri
      ),
      featureValues: this._parseFeatureValuesCsv(
        kwds.featureValuesCsv,
        rightsLicensesByUri
      ),
      features: this._parseFeaturesCsv(kwds.featuresCsv, rightsLicensesByUri),
    };
  }

  private _parseCsv(csv: string, csvName: string, config?: Papa.ParseConfig) {
    const parsedCsv = Papa.parse(csv, config);
    for (const error of parsedCsv.errors) {
      if (error.code === "TooFewFields") {
        continue;
      }
      throw new RangeError(
        "error parsing " + csvName + " CSV: " + error.message
      );
    }
    return parsedCsv;
  }

  private _parseDescription(
    rightsLicensesByUri: RightsLicensesByUri,
    row: CsvRowObjectType
  ): WorksheetDescription | undefined {
    const descriptionTextEn = row.description_text_en as string;
    if (!_.isEmpty(descriptionTextEn)) {
      return {
        rights: this._parseRights("description_", rightsLicensesByUri, row),
        textEn: descriptionTextEn,
      };
    } else {
      return undefined;
    }
  }

  private _parseDuplicateColumnRows(
    duplicateColumnNames: string[],
    rows: any[]
  ): CsvRowObjectType[] {
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

  private _parseFeaturesCsv(
    csv: string,
    rightsLicensesByUri: RightsLicensesByUri
  ): WorksheetFeatureDefinition[] {
    const features: WorksheetFeatureDefinition[] = [];
    const parsedCsv = this._parseCsv(csv, "features");
    const rows = this._parseDuplicateColumnRows(["value"], parsedCsv.data);
    rows.forEach((row, rowI) => {
      if (_.isEmpty(row)) {
        return;
      }
      try {
        features.push({
          description: this._parseDescription(rightsLicensesByUri, row),
          displayNameEn: row.display_name_en as string,
          id: row.id as string,
          valueIds: (row.feature_values_ids as string)
            .split(",")
            .map((featureValueId) => featureValueId.trim()),
        });
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

  private _parseFeatureSetsCsv(
    csv: any,
    rightsLicensesByUri: RightsLicensesByUri
  ): WorksheetFeatureSetDefinition[] {
    const featureSets: WorksheetFeatureSetDefinition[] = [];
    const parsedCsv = this._parseCsv(csv, "feature sets");
    const rows = this._parseDuplicateColumnRows(["feature"], parsedCsv.data);
    rows.forEach((row, rowI) => {
      if (_.isEmpty(row)) {
        return;
      }
      try {
        featureSets.push({
          description: this._parseDescription(rightsLicensesByUri, row),
          displayNameEn: row.display_name_en as string,
          featureIds: (row.features as string)
            .split(",")
            .map((featureId) => featureId.trim()),
          id: row.id as string,
        });
      } catch (e) {
        if (e instanceof RangeError) {
          console.error(
            "feature set row " + (rowI + 2) + " error: " + e.message
          );
        } else {
          throw e;
        }
      }
    });
    return featureSets;
  }

  private _parseFeatureValuesCsv(
    csv: string,
    rightsLicensesByUri: RightsLicensesByUri
  ): WorksheetFeatureValueDefinition[] {
    const values: WorksheetFeatureValueDefinition[] = [];
    const parsedCsv = this._parseCsv(csv, "features", {header: true});
    const rows = this._parseUniqueColumnRows(parsedCsv.data);
    rows.forEach((row, rowI) => {
      if (_.isEmpty(row)) {
        return;
      }

      const valueId = row.id as string;

      try {
        let image: WorksheetFeatureValueImage | undefined;
        const imageThumbnailUrl = this._parseFeatureValueImageUrl(
          "image_thumbnail_",
          row
        );
        if (imageThumbnailUrl) {
          image = {
            fullSizeUrl: this._parseFeatureValueImageUrl(
              "image_full_size_",
              row
            ),
            rights: this._parseRights("image_", rightsLicensesByUri, row),
            thumbnailUrl: imageThumbnailUrl,
          };
        } else {
          // console.warn("feature value row " + (rowI + 2) + " (" + valueId + ") has no image");
        }

        const value = {
          description: this._parseDescription(rightsLicensesByUri, row),
          displayNameEn: row.display_name_en as string,
          id: valueId,
          image,
        };
        values.push(value);
      } catch (e) {
        if (e instanceof RangeError) {
          console.error(
            "feature value row " + (rowI + 2) + " error: " + e.message
          );
        } else {
          throw e;
        }
      }
    });
    return values;
  }

  private _parseFeatureValueImageUrl(
    prefix: string,
    row: CsvRowObjectType
  ): WorksheetFeatureValueImageUrl | undefined {
    const absolute = row[prefix + "url"] as string;
    if (!_.isEmpty(absolute)) {
      return {absolute};
    }
    const relative = row[prefix + "rel_path"] as string;
    if (!_.isEmpty(relative)) {
      return {relative};
    }
    return undefined;
  }

  private _parseRights(
    columnNamePrefix: string,
    rightsLicensesByUri: RightsLicensesByUri,
    row: CsvRowObjectType
  ): WorksheetRights {
    try {
      const licenseUri = row[columnNamePrefix + "rights_license"] as string;
      const license = rightsLicensesByUri[licenseUri];
      if (!license) {
        throw new RangeError("missing license " + licenseUri);
      }
      return {
        author: row[columnNamePrefix + "rights_author"] as string,
        license,
        source: {
          name: row[columnNamePrefix + "rights_source_name"] as string,
          url: row[columnNamePrefix + "rights_source_url"] as string,
        },
      };
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
    const rows = this._parseUniqueColumnRows(
      this._parseCsv(csv, "features", {header: true}).data
    );
    rows.forEach((row, rowI) => {
      if (_.isEmpty(row)) {
        return;
      }

      try {
        const license = {
          nickname: row.Nickname as string,
          statement: row.Statement as string,
          uri: row.URL as string,
        };
        result[license.uri] = license;
      } catch (e) {
        if (e instanceof RangeError) {
          console.error(
            "rights licenses row " + (rowI + 2) + " error: " + e.message
          );
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
