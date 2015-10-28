job('Example dsl') {
    steps {
        shell('''
        	echo "hello world today"
    	'''.stripIndent())
    }
}