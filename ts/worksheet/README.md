# DressDiscover Worksheet web application

A Knockout.js+TypeScript serverless web application for describing historic apparel artifacts using a visual workflow.

## One-time setup

### Prerequisites

* [Node.js](https://nodejs.org)

### Install packages

From the current directory:

	npm install

## Debugging

From the current directory:

	npm start

This will start a webpack-dev-server on port 9000 and open a web browser to http://localhost:9000. The app is automatically recompiled and reloaded in the browser if its files change.

## Production build

From the current directory:

	npm run build

## Directory structure

	definitions/: CSV files defining feature sets, features, feature values, and extents
	node_modules/: installed node packages, not checked in
	src/: TypeScript source
	src/index.html: single web page, run through webpack HTML plugin to add a script tag with cache-busting hash to produce wwwroot/index.html
	src/dressdiscover/api: generated API models and services
	src/dressdiscover/gui: application logic: models, views, view models
	src/dressdiscover/gui/application.ts: entry point
	wwwroot/: static files, ready for deployment
	wwwroot/css/worksheet.css: single stylesheet produced by webpack, do not modify
	wwwroot/img/: images used by the app, deployed as-is
	wwwroot/index.html: single web page, generated by webpack from src/index.html, do not modify
	wwwroot/js/worksheet.js: single script produced by webpack, do not modify