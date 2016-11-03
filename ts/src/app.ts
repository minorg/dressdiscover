/// <reference path="../typings/index.d.ts" />

import "css/app.css";

import RootView = require("./view/RootView.ts");

$(() => {
    new RootView.RootView().render();
});
