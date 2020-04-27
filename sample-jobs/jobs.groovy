node ('slavenode1') {
  stage('shell commands'){
     sh ''' 
	 uptime
	 hostname
	 '''
  }
}
