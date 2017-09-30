package http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static class HelloHttpHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            //Headers headers = httpExchange.getRequestHeaders();
            Map<String, String> params = queryToMap(httpExchange.getRequestURI().getQuery());
            String parName = params.get("name");
            String htmlCode = "<h1>Hello, " + parName + "</h1>";
            httpExchange.sendResponseHeaders(200, htmlCode.length());
            OutputStream os = httpExchange.getResponseBody();
            os.write(htmlCode.getBytes());
            os.close();
        }

        private Map<String, String> queryToMap(String query) {
            Map<String, String> result = new HashMap<String, String>();
            for (String param : query.split("&")) {
                String pair[] = param.split("=");
                if (pair.length > 1) {
                    result.put(pair[0], pair[1]);
                } else {
                    result.put(pair[0], "");
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        Inet4Address inetAddress = (Inet4Address) Inet4Address.getByName("192.168.1.206");
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 2);
        server.createContext("/hello", new HelloHttpHandler()/* httpExchange -> {
            String htmlString = Files
<<<<<<< Updated upstream
                    .readAllLines(Paths.get("/Users/imac/IdeaProjects/PolyTest/src/main/java/http/index.html"))
=======
                    .readAllLines(Paths.get("C:\\Users\\Gleb\\IdeaProjects\\PolyTest\\src\\main\\java\\http\\index.html"))
>>>>>>> Stashed changes
                    .stream()
                    .collect(Collectors.joining());
            httpExchange.sendResponseHeaders(200, htmlString.length());
            OutputStream os = httpExchange.getResponseBody();
            os.write(htmlString.getBytes());
            os.close();
        }*/);
        server.start();
    }
}