//Client Program
import java.net.*;
import java.io.*;
public class TCPClient
{
	public static void main(String[] args)throws Exception
	{
		Socket s=new Socket("localhost",1234);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hello,How are you?");
		s.close();
	}
}