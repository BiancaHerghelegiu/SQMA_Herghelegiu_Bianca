pipeline{
    agent any
    triggers {
        githubPush()
    }
    stages {
             stage('PersonConformanceTest') {
                steps {
                    bat 'mvn -Dtests="person.PersonConformanceTest" test'
                }
            }
            stage('PersonExistenceTest') {
                steps {
                    bat 'mvn -Dtests="person.PersonExistenceTest" test'
                }
            }
        }
}