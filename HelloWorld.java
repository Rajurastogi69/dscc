//Step-1:-Define an interface for the Remote class/object
//the interface must extend all the RemoteInterfaces defined in the
//java.rmi package
//all the methods in these interfaces must include throws RemoteException
//statement

import java.rmi.*;
public interface HelloWorld extends Remote
{
public String display() throws RemoteException;
}