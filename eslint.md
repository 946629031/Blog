- # 最简单的 eslint 配置
    ```js
    // .eslint.js

    module.exports = {
        'env': {
            'browser': true,
            'es6': true,
            'node': true
        },
        'extends': 'eslint:recommended',
        // 'extends': ['eslint:recommended','plugin:react/recommended'],
        'parserOptions': {
            'ecmaVersion': 2019,
            'sourceType': 'module',
            'ecmaFeatures': {
                'jsx': true
            }
        },
        'rules': {
            // 缩进
            'indent': [
                'error',
                4 // 我的是编辑器自动格式化，不是使用tabs，而是四个空格
            ],
            'linebreak-style': [
                // 'error',
                'off',
                'windows'
            ],

            // 引号
            'quotes': [
                1,
                'single'
            ],


            // // 分号结尾
            // 'semi': [
            //     'error',
            //     'always'
            // ],


            // 允许声明未使用变量  args:参数检查
            'no-unused-vars': [2, { 'vars': 'local', 'args': 'none' }],
            // 'no-unused-vars': ['error', { 'vars': 'all', 'args': 'after-used', 'ignoreRestSiblings': false }],


            // 最大空行100
            'no-multiple-empty-lines': [0, { 'max': 100 }],
            'no-mixed-spaces-and-tabs': [0],
            // 不能使用console
            'no-console': 'off',

            // 未定义变量不能使用
            'no-undef': 1,
            // 0 或 off, 一样，表示关闭该功能
            // 1, 表示仅提示
            // 2, 表示报错

            // 一行结束后面不要有空格
            'no-trailing-spaces': 1,
            // 强制驼峰法命名
            'camelcase': 2,

            // 对象字面量项尾不能有逗号
            'comma-dangle': [2, 'never'],

            // this别名
            'consistent-this': [2, 'that'],

            // 函数后面的空格语法
            'space-before-function-paren': 1,
            // function name (arg) { ... }   // ✓ ok   1
            // function name(arg) { ... }    // ✗ avoid

            // 对象字面量中冒号的前后空格
            'key-spacing': ['error', { 'beforeColon': false, 'afterColon': true }],

            // 要求或禁止在注释前有空格
            'spaced-comment': ['error', 'always'],

            // 花括号中使用一致的空格
            'object-curly-spacing': ['error', 'always']


            // 'react/jsx-uses-vars': 1,
            // 'react/display-name': 1,
            // 'no-unexpected-multiline': 'warn'
        },
    };
    ```