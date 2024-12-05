import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");
        serverSocket.close();
    }
}
