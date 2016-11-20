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
    app: ['./src/dressdiscover/gui/app.ts']
  },
  module: {
    loaders: [
      {
        test: /\.css$/,
        //exclude: /node_modules/,
        loader: ExtractTextPlugin.extract('style-loader', 'css-loader')
      },
      //{
      //    test: /\.js$/,
      //    loader: 'babel-loader'
      //},
      {
          test: /\.less$/,
          //exclude: /node_modules/,
          loader: ExtractTextPlugin.extract('style-loader', 'css-loader!less-loader')
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
    new CopyWebpackPlugin([
    {
      from: './data/definitions.js',
      to: './definitions.js'
    },
    {
        from: './node_modules/jquery/dist/jquery.min.js',
        to: './jquery.min.js'
    },
    {
        from: './src/bootstrap.min.css',
        to: './bootstrap.min.css'
    },
    {
        from: './src/index.html',
        to: './index.html'
    }
    ]),
    new ExtractTextPlugin('app.css'),
    new webpack.ProvidePlugin({
        $: 'jquery',
        jQuery: "jquery",
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