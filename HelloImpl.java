//Step-2:implementation of the Remote Interface
//this interface must implement in a server side application
//the class must extends UnicastRemoteObject class
 
//we are creating a class which will implement the method of interface

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class HelloImpl extends UnicastRemoteObject implements HelloWorld
{
public HelloImpl() throws RemoteException
{
super();
}
public String display() throws RemoteException
{
return ("Welcome to RMI Application");
}
}
 