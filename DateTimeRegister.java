//step-3 Register the Server Object in rmiregistry 
//DateTimeRegister.java
import java.rmi.*;
import java.rmi.registry.*;
public class DateTimeRegister
{
	public static void main(String[] args)
	{
		try
		{
		Registry reg = LocateRegistry.createRegistry(2099);
		//Registry reg = LocateRegistry.getRegistry();
		DateTimeImpl obj = new DateTimeImpl();
		//going to register DateTimeImpl object in RmiRegistry
		//we have to use rebind() or bind()
		//reg.rebind("rmi://localhost:2099/dt",obj);
		Naming.rebind("rmi://localhost:2099/dt",obj);
		}
		catch(Exception e)
		{
		}
	}
}