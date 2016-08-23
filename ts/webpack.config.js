'use strict';

const webpack = require('webpack');
const ExtractTextPlugin = require('extract-text-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const path = require('path');

module.exports = {
  devtool: 'source-map',
  entry: {
    app: ['./app/app.ts']
  },
  module: {
    loaders: [
      {
        test: /\.css$/,
        exclude: /node_modules/,
        loader: ExtractTextPlugin.extract('style-loader', 'css-loader')
      },
	  {
        test: /\.ts$/,
        loader: 'ts'
      }
    ]
  },
  output: {
    filename: 'app.js',
    path: path.join(__dirname, './public'),
    publicPath: '/public'
  },
  plugins: [
    new ExtractTextPlugin('app.css'),
    new CopyWebpackPlugin([{
      from: './app/assets/index.html',
      to: './index.html'
    }]),
    new webpack.ProvidePlugin({
      $: 'jquery',
      _: 'underscore'
    })
  ],
  resolve: {
    extensions: ['', '.webpack.js', '.web.js', '.ts', '.js'],
    modulesDirectories: [path.join(__dirname, './node_modules')],
    root: path.join(__dirname, './app')
  },
  resolveLoader: {
    root: path.join(__dirname, './node_modules')
  }
};