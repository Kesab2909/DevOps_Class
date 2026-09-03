import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        HttpServer server =
            HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", (HttpExchange exchange) -> {

            String response =
                "<html>" +
                "<body>" +
                "<h1>Hello World from Java + Docker!</h1>" +
                "<p><strong>Name:</strong> Kesab Maharana</p>" +
                "<p><strong>Roll No:</strong> 24BCS10653</p>" +
                "</body>" +
                "</html>";

            exchange.sendResponseHeaders(200, response.length());

            OutputStream output = exchange.getResponseBody();
            output.write(response.getBytes());
            output.close();
        });

        server.start();

        System.out.println("Java server running on port 8080");
    }
}
