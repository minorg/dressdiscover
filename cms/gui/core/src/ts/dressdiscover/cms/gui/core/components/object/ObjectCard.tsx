import * as React from "react";
import {Object} from "dressdiscover/cms/gui/core/models/Object";

export const ObjectCard: React.FunctionComponent<{ object: Object }> = ({object}) =>
    <div>{object.title}</div>;
