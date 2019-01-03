const common = require('./webpack.common.js');
const merge = require('webpack-merge');

module.exports = merge(common, {
  devServer: {
    contentBase: "wwwroot",
    host: "localhost",
    inline: true,
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
    }
  }
});