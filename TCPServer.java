//WAP for one way Client and Server communication using Java Socket(TCP connection),
//where client sends a message to the server, then server reads the message and print
//Server Program
import java.net.*;//for Socket Programming(ServerSocket and Socket)
import java.io.*;
import java.util.*;
public class TCPServer
{
	public static void main(String[] args) throws Exception
	{
		//Step -2: create a ServerSocket object
		ServerSocket servSock=new ServerSocket(1234);
		//Step-3: keep the the Server in waiting
			Socket link = servSock.accept();
//Client asked one question 2+3=?
		//Step -4: read the input from client
		Scanner input=new Scanner(link.getInputStream());
		String msg=input.nextLine();
		System.out.println("Message from client:"+msg);
	}
}