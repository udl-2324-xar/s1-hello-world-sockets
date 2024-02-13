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

            // int i = dis.readInt();
            // System.out.println ("El nombre enter és " +  i);
            byte b3 = dis.readByte();
            byte b2 = dis.readByte();
            byte b1 = dis.readByte();
            byte b0 = dis.readByte();
            System.out.println("Bytes de l'enter: " + b3 + " " + b2 + " " + b1 + " " + b0);

            double d = dis.readDouble();
            System.out.println ("El nombre real és " +  d);

            // boolean b = dis.readBoolean();
            // System.out.println ("El booleà és " +  b);
            byte b = dis.readByte();
            System.out.println ("El byte del booleà és " + b);

            // String str = dis.readUTF();
            // System.out.println ("El text és \"" + str + "\"");
            short mida = dis.readShort();
            System.out.println ("La mida del text és " + mida);
            for (int i = 0; i < mida; i++) {
                byte c = dis.readByte();
                System.out.print((char) c);
            }
            System.out.println();

            dis.close();
            is.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
