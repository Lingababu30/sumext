pipeline{
    agent any
    stages{
        stage("checkout -pull from git hub" ){
            steps{
                checkout scm
        }
        }
        stage("build"){
            steps{
                echo"compiling java program"
                bat '''
                mkdir out
                javac Sum.java
                '''
            }
        }
        stage("run the program"){
            steps{
                    echo"running java program"
                    bat'''
                    java Sum
                    echo build_OK>artifact.txt
                    '''
                }
        }
    }
    post{
        always{
            archiveArtifacts artifacts:'artifact.txt',fingerprint:true
        }
    }
}    

