 
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>io.fastrack</groupId>
	<artifactId>fastrack-generic-test</artifactId>
	<version>1.0-SNAPSHOT</version>

	<repositories>
		<repository>
			<id>saucelabs-repository</id>
			<url>https://repository-saucelabs.forge.cloudbees.com/release</url>
			<releases>
				<enabled>true</enabled>
			</releases>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
	</repositories>

	<dependencies>
		<dependency>
			<groupId>io.fastrack</groupId>
			<artifactId>java-client</artifactId>
			<version>5.0.1</version>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<scope>compile</scope>
			<version>6.10</version>
		</dependency>
		<dependency>
			<groupId>com.saucelabs</groupId>
			<artifactId>sauce_junit</artifactId>
			<version>2.1.11</version>
			<scope>test</scope>
		</dependency>
	</dependencies>



</project>
