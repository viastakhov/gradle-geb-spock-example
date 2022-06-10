package geb.ui.modules

import geb.Module


class NginxFormModule extends Module {

    static content = {
        greetings { $('body > h1') }
        info { $('body > p:nth-child(2)') }
    }
}