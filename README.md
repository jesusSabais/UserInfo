Project Template for future backend projects

Project Description:
Java Version: 11
Springboot Version: 2.6.3

Additional information:
1 - Configured pipeline with (build, test, publish, deploy) stages.
2 - Controller class to test the project once it is deployed.

`If you are using this template, the following steps are required for a correct configuration.`

### Steps
1. Clone the template project to your computer.
2. Open and edit the pom.xml file, line 6 and 7.
   - change group id from  <groupId>com.apu.template</groupId> to match your projects group id.
   - change artifact id from <artifactId>archive-service</artifactId> to match your projects name.
3. Push this project to the new desired repository.
4. Once in a gitlab remote repository, the following variables must be added to your ci/cd variable section 
for the pipeline to function properly.

Required variables:
CONTAINER_REGISTRY_URL
CONTAINER_REGISTRY_APU_URL
CONTAINER_REGISTRY_USERNAME
CONTAINER_REGISTRY_PASSWORD
KUBECONFIG_FILE
TANZU_API_TOKEN
TANZU_MISSION_CONTROL_BINARY_URL

you can get the values for these variables in [Vault](https://vault-dev.usdc01.solera.farm/ui/vault/secrets/app-secrets/show/smr/apu/gitlab)