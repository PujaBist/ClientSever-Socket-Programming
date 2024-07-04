package sclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class echoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	System.out.println("waiting for clients..");
	ServerSocket ss =new ServerSocket(8888);
	Socket soc=ss.accept();
	System.out.println("connection established");
	DataInputStream dos=new DataInputStream(soc.getInputStream());
	
	String r=dos.readUTF();
String result=r.toLowerCase();
	System.out.println(result);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
