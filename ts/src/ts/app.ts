/// <reference path="../../typings/index.d.ts" />

import "../css/app.css";

import AppModel = require("./model/app_model.ts");
import AppView = require("./view/app_view.ts");

$(() => {
    new AppView({ model: new AppModel() }).render();
});
