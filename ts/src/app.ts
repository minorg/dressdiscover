/// <reference path="../typings/index.d.ts" />

import './css/app.css';
import DressDiscoverApplication = require("./DressDiscoverApplication");

$(() => {
    var app = new DressDiscoverApplication.DressDiscoverApplication();
    app.start();
});
