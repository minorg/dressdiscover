/// <binding BeforeBuild='Hot' AfterBuild='Watch - Development' />
require('es6-promise').polyfill();
const webpack = require('webpack');
const CleanWebpackPlugin = require('clean-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const ExtractTextPlugin = require('extract-text-webpack-plugin');
const path = require('path');

module.exports = {
  devServer: {
      contentBase: "public",
      host: "localhost",
      inline: true,
      port: 9000
  },
  devtool: 'source-map',
  entry: {
      app: ['./src/dressdiscover/gui/worksheet/application.ts']
  },
  externals: {
    // require("jquery") is external and available
    //  on the global var jQuery
    "jquery": "jQuery",
    "underscore": "_"
  },
  module: {
    loaders: [
      {
        test: /\.css$/,
        //exclude: /node_modules/,
        loader: ExtractTextPlugin.extract('style-loader', 'css-loader')
      },
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
    filename: 'js/worksheet.js',
    libraryTarget: 'umd',
    path: path.join(__dirname, './public')
  },
  plugins: [
    new CleanWebpackPlugin(['public'], {
        root: __dirname,
        exclude: ["bootstrap.min.css", "bootstrap.min.js", "fonts/", "img/", "jquery.min.js", "robots.txt", "underscore-min.js"],
        verbose: true,
        dry: false
    }),
    new CopyWebpackPlugin([
        {
          from: './assets',
          to: './'
        },
        {
            from: './node_modules/bootstrap/dist/js/bootstrap.min.js',
            to: './js/'
        },
        {
            from: './node_modules/jquery/dist/jquery.min.js',
            to: './js/'
        },
        {
            from: './node_modules/underscore/underscore-min.js',
            to: './js/'
        },
        {
            from: './src/index.html',
            to: './'
        }
    ]),
    new ExtractTextPlugin('./css/worksheet.css'),
    new webpack.ProvidePlugin({
        $: 'jquery',
        jQuery: "jquery",
        _: 'underscore'
    })
  ],
  resolve: {
    extensions: ['', '.webpack.js', '.web.js', '.ts', '.js'],
    root: path.join(__dirname, 'src')
  },
  resolveLoader: {
    root: path.join(__dirname, './node_modules')
  }
};