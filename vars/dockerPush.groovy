def call(String credentialsId, String imageName, String targetImage) {
    echo "Starting: Logging into Docker Hub and Pushing Image..."
    withCredentials([usernamePassword(
        credentialsId: credentialsId, 
        usernameVariable: 'DOCKER_USER', 
        passwordVariable: 'DOCKER_PASS')]) {
        
        sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
        sh "docker tag ${imageName} ${targetImage}"
        sh "docker push ${targetImage}"
    }
    echo "Success: Docker Image Pushed to Hub Successfully!"
}
