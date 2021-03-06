# react-exercise
client : react-spa + server : springboot

## CMD
```
npm init -y
```

```
npm install --save-dev @babel/core @babel/preset-env @babel/preset-react babel-loader babel-plugin-react-html-attrs \
        webpack webpack-cli webpack-dev-server \
        react react-dom \
        react-router react-router-dom \
        redux redux-logger redux-promise-middleware axios
```

## package.json
```
"scripts": {
    "start": "webpack-dev-server --content-base src --mode development --inline",
    // ......
},
```

## webpack.config.js
```
var debug   = process.env.NODE_ENV !== "production";
var webpack = require('webpack');
var path    = require('path');

module.exports = {
  context: path.join(__dirname, "src"),
  entry: "./js/index.js",
  module: {
    rules: [{
      test: /\.jsx?$/,
      exclude: /(node_modules|bower_components)/,
      use: [{
        loader: 'babel-loader',
        options: {
          presets: ['@babel/preset-react', '@babel/preset-env']
        }
      }]
    }]
  },
  output: {
    path: __dirname + "/src/",
    filename: "index.min.js",
    publicPath: '/'
  },
  devServer: {
    historyApiFallback: true
  },
  plugins: debug ? [] : [
    new webpack.optimize.UglifyJsPlugin({ mangle: false, sourcemap: false }),
  ],
};
```

## src/index.html
```
<!DOCTYPE html>
<html>
  <head>
    <title>React starter</title>
  </head>
  <body>
    <script src="index.min.js"></script>
  </body>
</html>
```

## src/js/index.js
```
```
