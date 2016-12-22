
## Pivotal Acceleration Lab project demonstrating the process of refactoring properties access.

### Refactor the application to use spring-cloud configuration server

This version loads properties from [Configuration Repository](https://github.com/poprygun/properties-demo-config)

### Run simple java app

1. Checkout _v3.0_

>git checkout v3.0

2. Create Cloud Configuration Server service pointing to the properties source repository.

>cf create-service -c '{"git": { "uri": "https://github.com/poprygun/properties-demo-config"} }' p-config-server standard pal-demo-properties-config-server

>cf set-env file-persistence TRUST_CERTS api.run.pez.pivotal.io

2. Package and push the application to Cloud Foundry

>mvn clean package && cf push

3. Countries drop down will be populated with data from local countries, and contries served from Config Server


