const ExtractTextPlugin = require('extract-text-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const path = require('path');

module.exports = {
  devtool: 'source-map',
  entry: {
    app: ['./src/dressdiscover/gui/worksheet/application.ts']
  },
  externals: {
    "jquery": "jQuery"
  },
  module: {
    rules: [{
      test: /\.ts$/,
      loader: 'awesome-typescript-loader'
    }]
  },
  output: {
    filename: 'js/worksheet.js',
    libraryTarget: 'umd',
    path: path.join(__dirname, './wwwroot')
  },
  plugins: [
    new ExtractTextPlugin('./css/worksheet.css'),
    new HtmlWebpackPlugin({
      filename: 'index.html',
      hash: true,
      template: 'src/index.html',
      xhtml: true
    })
  ],
  resolve: {
    extensions: ['.ts', '.js'],
    modules: [path.join(__dirname, 'src'), path.join(__dirname, 'node_modules')]
  },
  resolveLoader: {
    modules: [path.join(__dirname, 'node_modules')]
  }
};