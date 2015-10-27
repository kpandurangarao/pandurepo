freeStyleJob('svnjob') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        svn("http://svn.hti.com/svn/WEB/DRIVEABILITY/customercoreApplication/trunk")
    }   
}