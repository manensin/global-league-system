#!groovy

pipeline {
    agent none
    options {
        timestamps()
    }
    stages {
        stage('Build-League-App') {
            agent {
                label "app-builder"
            }
            tools {
                jdk "openjdk8"
            }
            steps {

                script {
                        // Compile , run test and build application.
                        bat 'mvn package'

                        archiveArtifacts artifacts: 'target/global-league-system.jar'
                }
            }
        }
        stage('Build-League-Image') {
            agent {
                label "image-builder"
            }
            steps {

                script {
                    copyArtifacts(filter: 'global-league-system.jar',fingerprintArtifacts: true, selector: lastSuccessful());
                    // Compile , run test and build application.
                    bat 'docker build -t global-league-system .'

                    // push image to artifactory like JFrog
                }
            }
        }
        stage('Run-Smoke-Test') {
            agent {
                label "smoke-agent"
            }
            steps {

                script {
                    // Get Image from Artifactory
                    bat 'docker run container global-league-system'
                    // Run selenium smoke test case
                }
            }
        }
        stage('Push-Image-To-Hub') {
            agent {
                label "Hub-Agent"
            }
            steps {

                script {
                    // Get Image from Artifactory
                    bat 'docker push global-league-system'
                }
            }
        }
        stage('Deploy-On-Environment') {
            agent {
                label "Deploy"
            }
            steps {
                script {
                    bat 'docker-compose -f docker-compose.yml'
                }
            }
        }
    }
}