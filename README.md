# camel-bang

Apache Camel to run a Camel Java route with jbang.

## How to run

The tool can be run via

- jbang

### Run via jbang

First you must install [jbang].

Then you can run Camel with

    jbang launch@davsclaus/camel-bang Foo.java

This will then startup Camel and load `Foo.java` as source and compile to Java
at startup.

You can specify multiple files:

    jbang launch@davsclaus/camel-bang Foo.java Bar.java

An example of a Camel java route is located here with the source code, which
you can copy and edit.

### Caution

This is just a little experiment and therefore not recommended for production.

The application only includes a tiny set of Camel components:

- camel-bean
- camel-log
- camel-timer


