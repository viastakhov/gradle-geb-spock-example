package geb.ui.pages

import geb.Page
import geb.ui.modules.NginxFormModule


class NginxPage extends Page {

    static at = { title == "Welcome to nginx!" }

    static content = {
        form { module NginxFormModule }
        em { $('body > p:nth-child(4) > em') }
    }
}
