/// <reference path="../../../../../typings/index.d.ts" />

import "../../../../css/app.css";

import AppModel = require("./models/app_model");
import AppView = require("./views/app_view");

$(() => {
    new AppView({ model: new AppModel() }).render();
});
