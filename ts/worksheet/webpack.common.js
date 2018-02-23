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
        test: /\.(scss)$/,
        use: [{
          loader: 'style-loader'
        }, {
          loader: 'css-loader'
        }, {
          loader: 'postcss-loader', // Run post css actions
          options: {
            plugins: function () { // post css plugins, can be exported to postcss.config.js
              return [
                require('precss'),
                require('autoprefixer')
              ];
            }
          }
        }, {
          loader: 'sass-loader' // compiles Sass to CSS
        }]
      },
      {
        test: /\.ts$/,
        loader: 'awesome-typescript-loader'
      }
    ]
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