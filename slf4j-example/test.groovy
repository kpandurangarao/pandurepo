freeStyleJob('example') {
    logRotator(-1, 10)
    scm {
        github('kpandurangarao/restrepo', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        maven('clean install')
    }
}