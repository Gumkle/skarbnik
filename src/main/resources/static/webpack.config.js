const path = require('path'); // do resolvowania sciezek
const MiniCssExtractPlugin = require('mini-css-extract-plugin');

module.exports = {
    entry: [
        "./src/main.js",
        "./src/main.scss"
    ],
    output: { // jak tutaj dodać jeszcze output do css?
        path: path.resolve(__dirname, 'dst'),
        filename: "script.js"
    },
    module: {
        rules: [ // każde entry składa się z testu i use, czyli dopasowanie i skojarzony loader. To mogą być arraye.
            {
                test: /\.s[ac]ss$/i, use: [ // chainowane loadery są ładowane od dołu do góry
                    { loader: MiniCssExtractPlugin.loader }, // bierze CSS z wygenerowanego JS i minifikuje// oczekuje sie ze ostatni w chainie zwroci js
                    { loader: 'css-loader' }, // CSS to commonJS
                    { loader: 'sass-loader' } // SASS to CSS
                ]
            }
        ]
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: 'style.css'
        })
    ],
    mode: 'production'
};
