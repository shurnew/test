package kr.geomex.z.question;

import java.io.DataInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SChatServer {

   public static void main(String[] args) {
      
      ServerSocket serverSocket = null;
      Socket socket = null;
      DataInputStream dis = null;
      
      try {

         // serverSocket = new ServerSocket(5001);
         serverSocket = new ServerSocket();
         serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));         
                                       
         while (true) {
            
            System.out.println("���� �����");
            
            socket = serverSocket.accept();
            
            System.out.println("������ Ŭ���̾�Ʈ ����");
            
            dis = new DataInputStream(socket.getInputStream());
                              
            System.out.println("���� : " + dis.readUTF());   
         }                  
         
      } catch (Exception e) {

      }
   }
}