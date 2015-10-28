freeStyleJob('example') {
    logRotator(-1, 10)
    jdk('Java 6')
    scm {
        github('https://github.com/kpandurangarao/pandurepo.git/TestRestExample', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        gradle('clean build')
    }
}