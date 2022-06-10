package geb

final class Constants {
    static final String BROWSER_TYPE = (System.env.GEB_BROWSER_TYPE ?: 'Chrome').toLowerCase()
    static final String BASE_URL = (System.env.GEB_BASE_URL?: 'http://web')
    static final String SELENIUM_HUB_URL = (System.env.SELENIUM_HUB_URL?: 'http://localhost:4444')
}
