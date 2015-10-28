freeStyleJob('example') {
    logRotator(-1, 10)
    scm {
        github('kpandurangarao/pandurepo', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        maven('clean install')
    }
}