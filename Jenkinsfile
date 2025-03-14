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
                    sh 'mvn clean package'
                    
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "This is test stage"
                    sh 'mvn test'
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