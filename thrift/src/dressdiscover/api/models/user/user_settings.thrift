namespace * dressdiscover.api.models.user

include "dressdiscover/api/models/worksheet/configuration/worksheet_configuration.thrift"

struct UserSettings {
    1: optional worksheet_configuration.WorksheetConfiguration worksheet_configuration;
}
