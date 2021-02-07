# camel-bang

Apache Camel to run a Camel Java route with jbang.

## How to run

The tool can be run via

- jbang

### Run via jbang

First you must install [jbang].

Then you can run with

    jbang launch@davsclaus/camel-bang https://raw.githubusercontent.com/davsclaus/camel-bang/main/Foo.java

Which will run Camel and download the `Foo.java` source code from github and compile as Java and add its routes.

If you have a local Java source code you of course use that

    jbang launch@davsclaus/camel-bang MyRoute.java

You can specify multiple files:

    jbang launch@davsclaus/camel-bang MyRoute.java Cheese.java

An example of a Camel java route is located here with the source code, which
you can copy and edit.

### Caution

This is just a little experiment and therefore not recommended for production.

The application only includes a tiny set of Camel components:

- camel-bean
- camel-log
- camel-timer


