package geb.spock

import geb.ui.pages.NginxPage
import groovy.util.logging.Log4j
import spock.lang.Narrative


@Log4j
@Narrative('Testing Nginx welcome page')
class NginxSpec extends GebSpec {

    def setupSpec() {
        log.info('Staring the feature ...')

        setup: 'Report test parameters'
        reportHeader """\
            <div class="issues">
                <div>Test parameters:</div>
                <ul>
                    <li><div>baseUrl: ${baseUrl}</div></li>
                </ul>
            </div>
            """.stripIndent()
    }


    def "Can get to the current Book of Geb"() {
        when: 'I open Nginx page'
        to NginxPage

        then: 'I see relevant info on the form'
        form.with {
            greetings.text() == 'Welcome to nginx!'
            info.text().contains('If you see this page, the nginx web server is successfully installed and working')
        }

        and: 'There is thanks message on the page'
        em.text() == 'Thank you for using nginx.'

        cleanup: 'Close browser'
        close()
        quit()
    }

    def cleanupSpec(){
        log.info('Stopping the feature ...')
    }
}
