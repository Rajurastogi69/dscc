//step4:create client stubs
import java.rmi.*;
import java.net.*;
import java.io.*;
public class HelloClient
{
public static void main(String[] args)
{
try
{
String host = "localhost";
//client stub
HelloWorld remoteObject = (HelloWorld)Naming.lookup("rmi://localhost:2099/Hello");
System.out.println(remoteObject.display());
}
catch(Exception e)
{
}
}
}
