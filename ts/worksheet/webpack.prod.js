const common = require('./webpack.common.js');
const merge = require('webpack-merge');
const webpack = require('webpack');

module.exports = merge(common, {
  plugins: [
    new webpack.optimize.UglifyJsPlugin({
      parallel: true,
      sourceMap: true
    })
  ]
});