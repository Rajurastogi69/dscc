//RPCCalcClient.java
import java.io.*;
import java.net.*;
import java.util.*;
class RPCCalcClient
{

  RPCCalcClient()
 {
    try
     {
	DatagramSocket ds =new DatagramSocket(1300);
	System.out.println("enter method name with values like add 4 5");
	while(true)
	{
          Scanner input = new Scanner(System.in);
	  //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	  String str = input.nextLine();
          //client is going to send the data
if(str.equalsIgnoreCase("quit"))
System.exit(1);

         byte b[] = str.getBytes();
	DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),1200);
ds.send(dp);

byte b1[] = new byte[4096];
dp = new DatagramPacket(b1,b1.length);
ds.receive(dp);
String s = new String(dp.getData(),0,dp.getLength());
System.out.println("Result ="+s);
System.out.println("enter method name with values like add 4 5");
	}
      }
catch(Exception e)
{
}
 }
public static void main(String[] args) 
{
new RPCCalcClient();
}
}
