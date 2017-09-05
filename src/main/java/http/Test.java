package http;

import com.sun.net.httpserver.HttpServer;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 2);
        server.createContext("/hello", httpExchange -> {
            String htmlString = Files
                    .readAllLines(Paths.get("/Users/imac/IdeaProjects/Test/src/main/java/http/index.html"))
                    .stream()
                    .collect(Collectors.joining());
            httpExchange.sendResponseHeaders(200, htmlString.length());
            OutputStream os = httpExchange.getResponseBody();
            os.write(htmlString.getBytes());
            os.close();
        });
        server.start();
    }
}
