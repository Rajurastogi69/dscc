//step-2 :-implementation of the interface
//DateTimeImpl.java(server object)
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.text.*;
public class DateTimeImpl extends UnicastRemoteObject implements DateTimeInterface
{
	DateTimeImpl() throws RemoteException
	{
	 super();//call the default	constructor of super class
	}
	public String getDate()throws RemoteException
	{
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date()).toString();
	}
	public String getTime()throws RemoteException
	{
		return new SimpleDateFormat("hh:mm:ss").format(new Date()).toString();
	}
}