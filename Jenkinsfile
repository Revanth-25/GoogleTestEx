pipeline{
  agent any 
           stages {
                   stage('Build')
                        {
                         steps{
                        bat "rmdir   /s  /q  AssessmentWebApp"
                        bat "git clone https://github.com/Revanth-25/GoogleTestEx.git"
                        bat "mvn clean -f GoogleTestEx"
                        echo 'Build Done'
                             }
                         }
                    stage('Test'){
                             steps{
                                  bat "mvn test -f GoogleTestEx"
                                   echo 'Tests Done'
                                  }
                             }
 
                 }
          }
