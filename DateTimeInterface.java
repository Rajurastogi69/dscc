//WAP to retrieve time and date function from server to client. This program should
//display server date and time by implementing RMI
//step -1 Define Server object interface
//DateTimeInterface.java
import java.rmi.*;
public interface DateTimeInterface extends Remote
{
	public String getDate()throws RemoteException;
	public String getTime() throws RemoteException;
}