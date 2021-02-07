//usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.apache.camel:camel-bom:3.8.0-SNAPSHOT@pom
//DEPS org.apache.camel:camel-main:3.8.0-SNAPSHOT
//DEPS org.apache.camel:camel-joor:3.8.0-SNAPSHOT
//DEPS org.apache.camel:camel-timer:3.8.0-SNAPSHOT
//DEPS org.apache.camel:camel-log:3.8.0-SNAPSHOT
//DEPS org.apache.camel:camel-bean:3.8.0-SNAPSHOT
//DEPS org.apache.logging.log4j:log4j-api:2.13.3
//DEPS ch.qos.logback:logback-core:1.2.3
//DEPS ch.qos.logback:logback-classic:1.2.3
//FILES application.properties
//FILES logback.xml

import java.util.StringJoiner;
import org.apache.camel.main.Main;

public class CamelBang {

    private static Main main;

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            StringJoiner sj = new StringJoiner(",");
            for (String a : args) {
                sj.add(a);
            }
            main.addInitialProperty("camel.main.routes-include-pattern", sj.toString());
        }
        main = new Main();
        main.run();
    }
}