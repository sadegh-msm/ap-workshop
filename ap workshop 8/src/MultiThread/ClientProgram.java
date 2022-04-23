package MultiThread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
/**
 * A Client Program To Exercise SocketPrograming / MultiThreading
 */
public class ClientProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            Socket socket=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            DataInputStream din = new DataInputStream(socket.getInputStream());
            while (true){
                String input = scanner.nextLine();
                dout.writeUTF(input);
                dout.flush();
                if (input.equalsIgnoreCase("over")){
                    System.out.println("you exited");
                    break;
                }
                System.out.println(din.readUTF());
            }
            dout.close();
            din.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
