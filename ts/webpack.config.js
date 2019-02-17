var webpack = require('webpack');
var path = require('path');

// variables
var distPath = path.join(__dirname, './dist');
var srcPath = path.join(__dirname, './src');

// plugins
var CopyWebpackPlugin = require('copy-webpack-plugin');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var MiniCssExtractPlugin = require('mini-css-extract-plugin');
var WebpackCleanupPlugin = require('webpack-cleanup-plugin');

module.exports = (env, argv) => ({
  context: srcPath,
  devServer: {
    clientLogLevel: 'warning',
    contentBase: distPath,
    historyApiFallback: true,
    host: 'localhost',
    // host: '0.0.0.0',
    hot: true,
    inline: true,
    open: true,
    port: 9000,
    proxy: {
      "/api": {
        "target": {
          "host": "localhost",
          "protocol": 'http:',
          "port": 8081
        },
        secure: false
      }
    },
    stats: 'minimal'
  },
  // https://webpack.js.org/configuration/devtool/
  devtool: argv.mode === "production" ? 'hidden-source-map' : 'cheap-module-eval-source-map',
  entry: {
    app: './ts/dressdiscover/gui/main.tsx'
  },
  module: {
    rules: [
      // static assets
      // { test: /\.html$/, use: 'html-loader' },
      // { test: /\.(a?png|svg)$/, use: 'url-loader?limit=10000' },
      // { test: /\.(jpe?g|gif|bmp|mp3|mp4|ogg|wav|eot|ttf|woff|woff2)$/, use: 'file-loader' },
      {
        test: /\.(scss)$/,
        use: [
          MiniCssExtractPlugin.loader,
          {
            loader: 'css-loader', // translates CSS into CommonJS modules
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
          }
        ]
      },
      // .ts, .tsx
      {
        test: /\.tsx?$/,
        use: [
          argv.mode !== "production" && {
            loader: 'babel-loader'
          },
          'ts-loader'
        ].filter(Boolean)
      }
    ]
  },
  output: {
    path: distPath,
    filename: 'js/dressdiscover-worksheet.js',
    publicPath: ''
  },
  plugins: [
    new WebpackCleanupPlugin(),
    new CopyWebpackPlugin([{
      from: 'img',
      to: path.join(distPath, 'img/')
    }, 'google*.html']),
    new MiniCssExtractPlugin({
      disable: argv.mode !== "production",
      filename: 'css/dressdiscover-worksheet.css'
    }),
    new HtmlWebpackPlugin({
      hash: true,
      template: 'index.html'
    }),
    new webpack.DefinePlugin({
      DEVELOPMENT: argv.mode === "development",
      PRODUCTION: argv.mode === "production"
    })
  ],
  resolve: {
    extensions: ['.js', '.ts', '.tsx'],
    // Fix webpack's default behavior to not load packages with jsnext:main module
    // (jsnext:main directs not usually distributable es6 format, but es6 sources)
    mainFields: ['module', 'browser', 'main'],
    alias: {
      definitions: path.resolve(__dirname, 'definitions'),
      dressdiscover: path.resolve(__dirname, 'src/ts/dressdiscover')
    }
  },
  target: 'web'
});