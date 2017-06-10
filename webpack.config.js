let webpack = require('webpack');
let path = require('path');

module.exports = {
    context: path.join(__dirname, './frontend/src'),
    target: 'web',
    entry: {
        index: ['./index.js']
    },
    module: {
        rules: [
            {
                test: /\.jsx$|\.js$/,
                exclude: /(node_modules|bower_components)/,
                use: {
                    loader: "babel-loader",
                    options: {
                        cacheDirectory: true,
                        presets: ['es2015', 'react', 'stage-0'],
                        plugins: ['react-html-attrs', 'transform-class-properties']
                    }
                }
            },
			{
				test: /\.css$/,
				loader: ['style-loader', 'css-loader?sourceMap', 'postcss-loader']
			},
			{
				test: /\.scss$/,
				use: [{
					loader: "style-loader", // creates style nodes from JS strings
					options: {
						sourceMap: true,
						sourceMapContents: true
					}
				}, {
					loader: "css-loader", // translates CSS into CommonJS
					options: {
						sourceMap: true,
						sourceMapContents: true
					}
				}, {
					loader: "sass-loader", // compiles Sass to CSS
					options: {
						sourceMap: true,
						sourceMapContents: true
					}
				}]
			}
        ]
    },
    plugins: {},
    resolve: {
        extensions: ['.js', '.json', '.jsx']
    },
    output: {
        path: __dirname + "/src/",
        filename: 'index.min.js'
        // filename: util.format('[name].%s.js', pkg.version)
    }
};
