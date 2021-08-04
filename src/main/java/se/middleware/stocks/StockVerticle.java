package se.middleware.stocks;

import io.vertx.core.AbstractVerticle;

public class StockVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Vert.x!"))
        .listen(8080);
  }

}
