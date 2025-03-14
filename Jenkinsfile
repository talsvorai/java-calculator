pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven' // Assumes Maven is installed and configured in Jenkins
        PATH = "${MAVEN_HOME}/bin:${env.PATH}" //Updating path to use maven
    }


    stages {
        stage('Checkout') {
            steps {
                script {
                    // Clone the repository from GitHub
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    echo "This is build stage"
                    sh 'sudo mvn test -Djava.awt.headless=true -X'
                    sh 'mvn clean package'
                    
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "This is test stage"
                    sh 'mvn test -Djava.awt.headless=true'
                    echo "Tests were successful"
                }
            }
        }
    }

    post {
        success {
            echo 'Build and tests passed successfully!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}