package sclient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	System.out.println("Client started");
	Socket soc= new Socket("LocalHost",8888);
	DataOutputStream dis=new DataOutputStream(soc.getOutputStream());
	dis.writeUTF("HLLello kabi");
	dis.flush();
	dis.close();
	soc.close();
	
} catch (UnknownHostException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
