/// <reference path="../typings/index.d.ts" />

import "css/app.css";

import AppModel = require("./model/AppModel.ts");
import AppView = require("./view/AppView.ts");

$(() => {
    new AppView({ model: new AppModel() }).render();
});
