import org.apache.camel.builder.RouteBuilder;

public class Foo extends RouteBuilder {
  @Override
  public void configure() throws Exception {
      from("timer:java?period=1000")
        .setBody()
          .simple("Hello Camel from ${routeId}")
        .to("log:info");
  }
}
