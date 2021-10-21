module.exports = {
    base: '/brcc/',
    lastUpdated: 'Last Updated',
    locales: {
        '/': {
            lang: 'zh-CN',
            title: '配置中心'
        },
        '/en-US/': {
            lang: 'en-US',
            title: 'BRCC'
        }
    },
    themeConfig: {
        sidebar: 'auto',
        logo: '/logo.png',
        locales: {
            '/': {
                lang: 'zh-CN',
                selectText: '选择语言',
                label: '简体中文',
                algolia: {},
                nav: [
                    {text: '主页', link: '/'},
                    {text: '快速开始', link: '/start'},
                    {text: '部署', link: '/deploy'},
                    {text: '开放接口', link: '/api'},
                    {text: '使用手册', link: '/console'},
                    {
                        text: 'SDK',
                        items: [
                            {text: 'Go SDK', link: '/go-sdk'},
                            {text: 'Java SDK', link: '/java-sdk'}
                        ]
                    },
                    {text: 'Github', link: 'https://github.com/baidu/brcc'}
                ]
            },
            '/en-US/': {
                selectText: 'Languages',
                label: 'English',
                ariaLabel: 'Languages',
                lang: 'en-US',
                nav: [
                    {text: 'Home', link: '/en-US/'},
                    {text: 'Quick Start', link: '/en-US/start'},
                    {text: 'Deploy', link: '/en-US/deploy'},
                    {text: 'Open API', link: '/en-US/api'},
                    {text: 'Console', link: '/en-US/console'},
                    {
                        text: 'SDK',
                        items: [
                            {text: 'Go SDK', link: '/en-US/go-sdk'},
                            {text: 'Java SDK', link: '/en-US/java-sdk'}
                        ]
                    },
                    {text: 'Github', link: 'https://github.com/baidu/brcc'}
                ]
            }
        }
    }
};
