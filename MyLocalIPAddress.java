//WAP to dispaly LocalIP address
//to implement Network programming using Java, import
//java.net.*;

import java.net.*;
public class MyLocalIPAddress
{
public static void main(String[] args)
{
//InetAddress class supports to find IP address of any system
//getLocalHost() is one of the static method of InetAddress class
//public static InetAddress getLocalHost() throws Exception
try
{
 InetAddress address=InetAddress.getLocalHost();
//String name=address.getHostName();
//String host=address.getHostAddress();
//InetAddress add=InetAddress.getByName("Google");
System.out.println(address);
//System.out.println(name);
//System.out.println(host);
  

}
catch(UnknownHostException uhEx)
{
  System.out.println("Could not find the IP address");
}
}
}
