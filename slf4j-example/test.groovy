freeStyleJob('example') {
    logRotator(-1, 10)
    scm {
        github('kpandurangarao/pandurepo/tree/master/TestRestExample', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        maven('clean install')
    }
}