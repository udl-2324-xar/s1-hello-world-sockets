import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloWorldServer {
    public static void main(String[] args){
        System.out.println("Hola sóc el server, ara començo a fer algo");

        int port = 1234;
        try {
            ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int enterLlegit = dis.readInt();
            System.out.print("He llegit l'enter:");
            System.out.println(enterLlegit);
            dis.close();
            is.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
