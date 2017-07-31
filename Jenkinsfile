node {
  def mvnHome = tool 'maven3'
  def javaHome = "C:/Program Files/Java/jdk1.8.0_121/bin"
  stage ("Intial Preparation") {
    bat "echo Preparations are done -- ${mvnHome} --${javaHome} "
  }
  stage ("Build Code") {
   
    bat "cd C:/Users/966986/Downloads/Spring_Boot_with_MongoDb  && ${mvnHome}/bin/mvn clean package"
    bat "echo code is builded"
  }
}
