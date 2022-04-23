package SingleThread;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 * A Client Program To Exercise SocketPrograming
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
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
