def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=npm-sqube-trivy-owasp-docker-k8s-prometheus-grafana -Dsonar.projectKey=npm-sqube-trivy-owasp-docker-k8s-prometheus-grafana '''
    }
}