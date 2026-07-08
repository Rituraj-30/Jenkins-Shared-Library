def call(String imageName) {
    echo "Starting: Docker Image Building..."
    sh "whoami"
    sh "docker build -t ${imageName} ."
    echo "Success: Docker Image '${imageName}' Build Ho Chuki Hai!"
}
