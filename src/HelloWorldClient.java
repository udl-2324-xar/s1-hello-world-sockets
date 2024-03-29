import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class HelloWorldClient {
    public static void main(String[] args) {
        System.out.println("Client: inicio intent de connexió");
        String host = "127.0.0.1";
        if (args.length > 0){
            host = args[0];
        }
        int port = 1234;
        try {
            Socket s = new Socket(host, port);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeInt(99);
            dos.flush();
            dos.close();
            s.close();
        } catch (IOException e) {
            System.out.println("err");
            throw new RuntimeException(e);
        }
    }
}