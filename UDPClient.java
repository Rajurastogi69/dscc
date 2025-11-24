//UDP client program
import java.net.*;//for Socket programming
public class UDPClient
{
	public static void main(String[] args)throws Exception
      {
	//Step -1 : create an instance of DatagramSocket
	DatagramSocket ds=new DatagramSocket();//it will take any port number
	//Step-2 define or retrive the server address with the help of
	//InetAddress
	InetAddress ip=InetAddress.getByName("localhost");
	String msg="Hi!How are you?";
	// Step-3 covert String type msg to bytecode and bind in DatagramPacket
	//object
	
DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,1235);
//step- 4 send the packet to the receiver with the help of send() of DatagramSocket
ds.send(dp);
//receiving message from server
byte[] buffer=new byte[1024];
DatagramPacket recPacket=new DatagramPacket(buffer,buffer.length);
ds.receive(recPacket);
String response=new String(recPacket.getData(),0,recPacket.getLength());
System.out.println("Server Message:"+response);

      }
}