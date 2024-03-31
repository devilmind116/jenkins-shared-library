def call() {
    sh 'trivy image devilmind116/youtube:latest > trivyimage.txt'
}