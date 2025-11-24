//step3:build objects to a Registry service
//server applcation will use bind() and rebind() to register
//an object in RMI registry

import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;
import java.io.*;
public class HelloServer
{
public static void main(String[] args)
{
try{
Registry reg=LocateRegistry.createRegistry(2099);
HelloImpl localObj=new HelloImpl();
Naming.rebind("rmi://localhost:2099/Hello",localObj);
}
catch(Exception e)
{
}
}
}