pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from Git
                git branch: 'employeeAppInitial', url: 'https://github.com/bbsmca05/EmployeeDetailsApp.git'
            }
        }

        stage('Build') {
            steps {
                // Build the Java program using Maven
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                // Run tests if applicable
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your Java application if needed
                // Example: sh 'java -jar target/your-application.jar'
            }
        }
    }
}
