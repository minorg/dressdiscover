/// <binding BeforeBuild='Hot' AfterBuild='Watch - Development' />
require('es6-promise').polyfill();
const webpack = require('webpack');
const ExtractTextPlugin = require('extract-text-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const path = require('path');

module.exports = {
  devServer: {
      contentBase: "public",
      host: "localhost",
      port: 9000
  },
  devtool: 'source-map',
  entry: {
    app: ['./src/ts/dressdiscover/gui/app.ts']
  },
  module: {
    loaders: [
      {
        test: /\.css$/,
        //exclude: /node_modules/,
        loader: ExtractTextPlugin.extract('style-loader', 'css-loader')
      },
	  {
        test: /\.ts$/,
        loader: 'ts'
      }
    ]
  },
  output: {
    filename: 'app.bundle.js',
    path: path.join(__dirname, './public')
  },
  plugins: [
    new ExtractTextPlugin('app.css'),
    new CopyWebpackPlugin([{
      from: './src/index.html',
      to: './index.html'
    }, {
    from: './data/features.js',
    to: './features.js'
    }]),
    new webpack.ProvidePlugin({
      $: 'jquery',
      _: 'underscore'
    })
  ],
  resolve: {
    extensions: ['', '.webpack.js', '.web.js', '.ts', '.js'],
    modulesDirectories: [path.join(__dirname, './node_modules')],
    root: path.join(__dirname, 'src')
  },
  resolveLoader: {
    root: path.join(__dirname, './node_modules')
  }
};