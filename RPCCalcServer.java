import java.net.*;
import java.util.*;
class RPCCalcServer
{
	DatagramSocket ds;
	DatagramPacket dp;
String str, methodName,result;
int val1, val2;
   RPCCalcServer()
   {
	try
	{
	  ds = new DatagramSocket(1200);
	  byte buffer[] = new byte[4096];
	  while(true)
           {
//server is going to receive data from client in the form of packet
             dp = new DatagramPacket(buffer,buffer.length);//add 4 5
	     ds.receive(dp);
	     str= new String(dp.getData(),0,dp.getLength());
	if(str.equalsIgnoreCase("quit"))
System.exit(1);
else
{
             StringTokenizer st = new StringTokenizer(str," ");
	     methodName = st.nextToken();
	     val1 = Integer.parseInt(st.nextToken());
	     val2 = Integer.parseInt(st.nextToken());
}
             System.out.println("method name ="+methodName);
	     if(methodName.equalsIgnoreCase("add"))
	     result =""+add(val1,val2);
	     else if(methodName.equalsIgnoreCase("sub"))
	     result =""+sub(val1,val2);
	     else if(methodName.equalsIgnoreCase("mul"))
	     result =""+mul(val1,val2);
	     else if(methodName.equalsIgnoreCase("div"))
	     result =""+div(val1,val2);

	     byte buff[] = result.getBytes();
	     DatagramPacket dp1 = new DatagramPacket(buff,buff.length,InetAddress.getLocalHost(),1300);
	     ds.send(dp1);
	   }
	}
catch(Exception e)
{
}
   }
public int add(int val1,int val2)
{
return val1 + val2;
}
public int sub(int val1,int val2)
{
return val1 - val2;
}
public int mul(int val1,int val2)
{
return val1 * val2;
}
public int div(int val1,int val2)
{
return val1 / val2;
}
public static void main(String[] args)
{
new RPCCalcServer();
}
}