import java.rmi.*;

import java.rmi.server.*;

/**
 *
 * @author Acer
 */
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf 

{
	
String s1=new String[20];  
	static int f=-1,r=-1;
	
public AddServerImpl() throws RemoteException 
	
{
    
}

	public int diff() throws RemoteException
   
	{try{
		int temp=r-f;
		if(r==f){r=-1;f=-1;}
		return temp;}
	catch(Exception e){}
	}
	 
public void send(String d1) throws RemoteException 

	{try{
	        r++; 
 
	       
 s1[r]=d1;
}
	catch(Exception e){}
	
 }
  
	 public String receive () throws RemoteException 

	{try{
		f++;
		return s1[f];
}
	catch(Exception e){}
                   
}
 
  
}