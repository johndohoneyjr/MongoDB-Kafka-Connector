# Docker Version of Kafka Connector

## Preliminaries
 Install Gradle for initial build (make sure you are NOT Air-Gapped)

## Documentation

Documentation for the connector is available on [https://docs.mongodb.com/ecosystem/connectors/kafka/](https://docs.mongodb.com/ecosystem/connectors/kafka/)

## Build

Java 8+ is required to build and compile the source. To build and test the driver:

```
$ git clone https://github.com/mongodb/mongo-kafka.git
$ cd mongo-kafka
$ ./gradlew check -Dorg.mongodb.test.uri=mongodb://localhost:27017
```

The test suite requires mongod (local or Atlas Cloud) to be running. Note, the source connector requires a replicaSet.

## Docker

```
$ cd docker
```
## Kafka Connect Connection URI -- UPDATE

The format of the URI is as follows
```
     "mongodb+srv://<uid>:<passowrd>@<cluster-ip>",
```
Besure to change my Cluster, to your Atlas Cluster
     "connection.uri":"mongodb+srv://foo:bar@demo-store-hbwxn.mongodb.net/test",

     BE SURE TO DELETE THE LINE:      // "connection.uri":"mongodb+srv://<uid>:<passowrd>@<cluster-ip>",
     This is just a syntax reminder

Before driving yourself crazy, connect to the URI with the shell.

## READY SET GO  :)
```
    chmod 755 *.sh
    ./run-Atlas.sh
```

