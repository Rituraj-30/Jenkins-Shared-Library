def call(String containerName, String imageName, String portMapping) {
    echo "Starting: Deploying Application..."
    // Purane containers ko clear karna
    sh "docker stop ${containerName} || true"
    sh "docker rm ${containerName} || true"
    
    // Naya container up karna
    sh "docker run -d -p ${portMapping} --name ${containerName} ${imageName}"
    echo "Success: Application Deployed Successfully on Port ${portMapping}!"
}
