pipeline {
    agent any
    
    stages {
	
	stage('Checkout') {
		steps {
			echo 'Getting application code...'
			}
		}
        stage('Build') {
            steps {
               	sh 'javac helloapp.java'
            }
        }
        
        stage('Run') {
            steps {
                sh 'java helloapp'
         	}
        }
        
    }
}
