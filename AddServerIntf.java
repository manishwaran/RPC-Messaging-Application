import java.rmi.*;


public interface AddServerIntf extends Remote
{
    
int diff() throws RemoteException;

void send(String d1) throws RemoteException;
    
String receive() throws RemoteException;


}