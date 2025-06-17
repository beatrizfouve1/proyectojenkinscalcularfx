pipeline {
    agent any

    tools {
        maven 'Maven-3.8.6'  // Nombre de tu instalación de Maven en Jenkins
        jdk 'jdk17'         // Nombre de tu JDK configurado en Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
                junit '**/target/surefire-reports/*.xml'
                jacoco execPattern: '**/target/jacoco.exec'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {  // Nombre de tu servidor SonarQube en Jenkins
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Publish') {
            when {
                branch 'main'
            }
            steps {
                sh 'mvn deploy'
            }
        }
    }

    post {
        always {
            emailext attachLog: true,
                subject: "[Jenkins] ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
                body: "Run: ${env.BUILD_URL}",
                to: 'dev-team@example.com'
        }
        success {
            slackSend color: 'good', message: "Build Success: ${env.JOB_NAME} - ${env.BUILD_URL}"
        }
        failure {
            slackSend color: 'danger', message: "Build Failed: ${env.JOB_NAME} - ${env.BUILD_URL}"
        }
    }
}