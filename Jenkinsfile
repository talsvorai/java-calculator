pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven' // Assumes Maven is installed and configured in Jenkins
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
                    bat "${MAVEN_HOME}/bin/mvn clean package"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh "${MAVEN_HOME}/bin/mvn test"
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