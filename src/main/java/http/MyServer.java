package http;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

// @Address(port = 8080)
public class MyServer {

    private HttpServer httpServer;
    private ServerConfig serverConfig;

    public MyServer(ServerConfig serverConfig) {
        this.serverConfig = serverConfig;
//        this.httpServer = HttpServer.create(new InetSocketAddress(8000), 2);
    }

    //    start()
}
