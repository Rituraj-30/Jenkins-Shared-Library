def call(String repoUrl, String branchName = 'main') {
    echo "Starting: Code Cloning from GitHub..."
    git url: repoUrl, branch: branchName
    echo "Success: Code Cloning Complete!"
}
