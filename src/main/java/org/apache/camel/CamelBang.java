package org.apache.camel;

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
