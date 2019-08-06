# Android Device Provisioning Partner API Client Library for Java

Automates Android zero-touch enrollment for device resellers, customers, and EMMs.

This page contains information about getting started with the Android Device Provisioning Partner API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Android Device Provisioning Partner API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Android Device Provisioning Partner API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-androiddeviceprovisioning</artifactId>
      <version>v1-rev20190704-1.30.1</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```gradle
repositories {
  mavenCentral()
}
dependencies {
  compile 'com.google.apis:google-api-services-androiddeviceprovisioning:v1-rev20190704-1.30.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-androiddeviceprovisioning/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/