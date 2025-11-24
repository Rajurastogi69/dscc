// UDP server program
import java.net.*;
public class UDPServer
{
	public static void main(String[] args)throws Exception
	{
		//step-1 create an instance of DatagramSocket class
		DatagramSocket ds=new DatagramSocket(1235);//1235 is port number
		//step-2 create a predefined space of byte[] type inside memory
	byte[] buffer=new byte[1024];//array size should in the form of 2^n 
	//Step-3 create an instance of DatagramPacket with the array and array size
	DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
	//Step-4 receive the message with the help of receive() of DatagramSocket
	ds.receive(dp);
	//Step-5 convert the bytecode message to String type
	String msg=new String(dp.getData(),0,dp.getLength());
	System.out.println("Message from client:"+msg); 
//Sending response msg to client
InetAddress ip=InetAddress.getByName("localhost");
String response="hello! I am fine.";
DatagramPacket sendPacket=new DatagramPacket(response.getBytes(),response.length(),ip,1234);
ds.send(sendPacket);        

	}
}