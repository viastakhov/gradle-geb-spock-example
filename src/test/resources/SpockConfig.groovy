runner {
    filterStackTrace true
}

report {
    issueNamePrefix 'Defect '
    issueUrlPrefix 'https://jira-host/browse/'
}

spockReports {
    set 'com.athaydes.spockframework.report.testSourceRoots': 'src/test/groovy'
    set 'com.athaydes.spockframework.report.showCodeBlocks': true
    set 'com.athaydes.spockframework.report.hideEmptyBlocks': true
    set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.enabled': true
    set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.printThrowableStackTrace': true
    set 'com.athaydes.spockframework.report.outputDir': './build/spock-reports'
    set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.excludeToc': false
    set 'com.athaydes.spockframework.report.projectName': 'Geb Spock'
    set 'com.athaydes.spockframework.report.projectVersion': 'R1'
}
