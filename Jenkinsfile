pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven' // Assumes Maven is installed and configured in Jenkins
        PATH = "${MAVEN_HOME}/bin:${env.PATH}" //Updating path to use maven
        DISPLAY = ":99"  // Assuming you're using Xvfb or virtual display
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
                    sh 'sudo mvn clean package -DskipTests'
                    
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "This is test stage"
                    sh 'sudo mvn test'
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