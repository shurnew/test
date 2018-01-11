package kr.geomex.z.question;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SChatClient {

   public static void main(String[] args) {
      
      Socket socket;
      DataOutputStream dos;
      
      try {

         socket = new Socket();
         socket.connect(new InetSocketAddress("127.0.0.1",5001));                        
         dos = new DataOutputStream(socket.getOutputStream());
         
         System.out.println("Ŭ���̾�Ʈ : ���Ἲ���ߴ�!!!");
                  
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();
         
         dos.writeUTF(str);
         dos.flush();
         dos.close();
                        
      } catch (Exception e) {

      }
   }
}