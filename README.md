# container-buildpacks-demo
Demo application for usage of default buildpacks to build springboot app images without Dockerfile

https://buildpacks.io/

Buildpacks transform your application source code into OCI compliant images that can run on any cloud.
For Springboot, it creates layered images from the app jar itself.
More info on layered images ->  https://spring.io/guides/topicals/spring-boot-docker/

The Buildpacks integration provided by the Spring Boot Plugin can be used to build images with bootBuildImage task in the build.gradle.


```
bootBuildImage {
    imageName = "${project.name}"
    environment = ["BP_JVM_VERSION" : "17.*"]
}
```

Now you can build an image using below command from the root of the project(for gradle based project).

`./gradlew bootBuildImage
`


You can verify that the build generations steps includes jar layers from the output of the above command.

The generated docker image can be viewed using `docker image ls`

Now to run this image as docker image use below command.

`docker run -d --name container-buildpacks-app -p 8080:8080 container-buildpacks-demo`

This is how we generate container images for a springboot app using buildpacks !