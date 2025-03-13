pipeline {
    agent any

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
                    bat 'mvn clean package'
                    
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "This is test stage"
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