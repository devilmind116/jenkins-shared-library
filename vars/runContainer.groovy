def call(){
    sh "docker run -d --name youtube-clone -p 3000:3000 devilmind116/youtube:latest"
}