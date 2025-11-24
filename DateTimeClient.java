//step-4 create a client program
//DateTimeClient.java
import java.rmi.*;
public class DateTimeClient
{
	public static void main(String[] args)
	{
		try
		{
		DateTimeInterface obj=(DateTimeInterface)Naming.lookup("rmi://localhost:2099/dt");
		//it is used serach or look for the server object
		System.out.println("Date is:"+obj.getDate());
		System.out.println("Time is:"+obj.getTime());
		}
		catch(Exception e)
		{
		}
	}
}