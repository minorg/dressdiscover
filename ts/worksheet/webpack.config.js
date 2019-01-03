var webpack = require('webpack');
var path = require('path');

// variables
var isProduction = process.argv.indexOf('-p') >= 0 || process.env.NODE_ENV === 'production';
var srcPath = path.join(__dirname, './src');

// plugins
var HtmlWebpackPlugin = require('html-webpack-plugin');
var MiniCssExtractPlugin = require('mini-css-extract-plugin');
var WebpackCleanupPlugin = require('webpack-cleanup-plugin');

module.exports = {
  context: srcPath,
  devServer: {
    port: 9000,
    host: 'localhost',
    // historyApiFallback: true,
    // watchOptions: {
    //   aggregateTimeout: 300,
    //   poll: 1000
    // },
    open: true,
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
    contentBase: srcPath,
    hot: true,
    inline: true,
    historyApiFallback: {
      disableDotRule: true
    },
    stats: 'minimal',
    clientLogLevel: 'warning'
  },
  // https://webpack.js.org/configuration/devtool/
  devtool: isProduction ? 'hidden-source-map' : 'cheap-module-eval-source-map',
  entry: {
    app: './ts/dressdiscover/gui/worksheet/main.tsx'
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
          // process.env.NODE_ENV !== 'production' ? 'style-loader' : MiniCssExtractPlugin.loader,
          MiniCssExtractPlugin.loader,
        //   {
        //   loader: 'style-loader', // inject CSS to page
        // },
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
        }]
      },
      // .ts, .tsx
      {
        test: /\.tsx?$/,
        use: [
          !isProduction && {
            loader: 'babel-loader'
          },
          'ts-loader'
        ].filter(Boolean)
      }
    ]
  },
  output: {
    path: path.join(__dirname, './dist'),
    filename: 'js/dressdiscover-worksheet.js',
    publicPath: '/'
  },
  plugins: [
    new webpack.EnvironmentPlugin({
      NODE_ENV: 'development', // use 'development' unless process.env.NODE_ENV is defined
      DEBUG: false
    }),
    new WebpackCleanupPlugin(),
    new MiniCssExtractPlugin({
      disable: !isProduction,
      filename: 'css/dressdiscover-worksheet.css'
    }),
    new HtmlWebpackPlugin({
      hash: true,
      template: 'index.html'
    })
  ],
  resolve: {
    extensions: ['.js', '.ts', '.tsx'],
    // Fix webpack's default behavior to not load packages with jsnext:main module
    // (jsnext:main directs not usually distributable es6 format, but es6 sources)
    mainFields: ['module', 'browser', 'main'],
    alias: {
      dressdiscover: path.resolve(__dirname, 'src/ts/dressdiscover')
    }
  },
  target: 'web'
};
