/// <reference path="../typings/index.d.ts" />

import './css/app.css';
import $ = require("jquery");
//import UserView = require("./view/UserView");
//import UserModel = require("./model/UserModel");

$(() => {
    alert("Hello world");
    var body = $("content");
    body.html('');
    //body.append(new UserView({ model: new UserModel() }).render().$el);
});
