# scalatra-starter

Simple Scalatra project


## Features

1. Scalatra Setup
  * http://scalatra.org/2.3/guides/deployment/configuration.html
  * webapp/WEB-INF/web.xml
2. Add swagger-ui 2.1.4
  * https://github.com/swagger-api/swagger-ui/tree/v2.1.4
  * modify swagger-ui/index.html
    * var url = window.location.origin + "/swagger-resources";
3. Add index.html to redirect to swagger
4. Health check endpoint to return static build info

## Todo
5. Unit tests
6. Integration tests


## Fork

1. Modify build.sbt
2. Move packages