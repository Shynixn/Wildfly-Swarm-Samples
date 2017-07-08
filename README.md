# Wildfly-Swarm-Samples [![GitHub license](http://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/Shynixn/Wildfly-Swarm-Samples/master/LICENSE)

Samples how to use the microservice wildfly-swarm. 

| branch        | status        |
| ------------- | --------------|
| master        | [![Build Status](https://travis-ci.org/Shynixn/Wildfly-Swarm-Samples.svg?branch=master)](https://travis-ci.org/Shynixn/Wildfly-Swarm-Samples)              |


## Jaxrs-Cdi (JaxrsCdi)

Sample project how to use wildfly-swarm as very small rest service with lightweight dependency injection via CDI. No EJB. 

- Jax-rs
- CDI

## Jaxrs-Cdi-Db (JaxrsCdiDb)

Sample project how to use wildfly-swarm as rest service with CDI and a h2 database via JPA. No EJB. 

- Jax-rs
- CDI
- JPA
- H2-DB

### Configure database

If you want to customize your database access. Put the following properties in your pom.xml
[More about configuring databases](https://wildfly-swarm.gitbooks.io/wildfly-swarm-users-guide/content/configuration_properties.html)


```xml
    <build>
        <finalName>${project.finalname}</finalName>
        <plugins>
            <plugin>
                <groupId>org.wildfly.swarm</groupId>
                <artifactId>wildfly-swarm-plugin</artifactId>
                <configuration>
                    <mainClass>${project.mainclass}</mainClass>
                   <properties>
                        <swarm.ds.name>ExampleDS</swarm.ds.name>
                        <swarm.ds.username>app</swarm.ds.username>
                        <swarm.ds.password>app</swarm.ds.password>
                        <swarm.ds.connection.url>jdbc:h2:./db/repository</swarm.ds.connection.url>
                    </properties>
                </configuration>
                <version>${version.wildfly-swarm}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>package</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

## Licence

The source code is licensed under the MIT license. 
