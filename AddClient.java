import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.rmi.Naming;

public class AddClient 
{
    
public static void main(String args[]) 
{
        
try 
{
            
String addServerURL = "rmi://" + args[0] + "/AddServer";
            
AddServerIntf addServerIntf =
            (AddServerIntf)Naming.lookup(addServerURL);
            
           
int choice = 0,n;
            
String d1, d2;
            
double result = 0.0;
            
BufferedReader console = new BufferedReader (new InputStreamReader (System.in));  
            
            
while (true) 
{
                
System.out.println ("Menu");
                
System.out.println ("(1) SEND");
                
System.out.println ("(2) RECEIVE");
                
System.out.println ("(0) Quit");

                
choice = Integer.parseInt (console.readLine());
                
                
if (choice == 0) 
{
                    
System.exit (0);
                
}
                
                

                
switch (choice) 
{
                    
case 1: 

System.out.println("ENTER THE MESSAGE:");
d1=console.readLine();
                
addServerIntf.send (d1);
                            
break;
                    

case 2: 

n=diff();
System.out.println("RECEIVED MESSAGE(s):");

      
for(int i=0;i<n;i++)
{
d2= addServerIntf.receive ();
System.out.println(d2);

      
}
n=diff();


 break;
                    

default: System.out.println ("Unknown Option Chosen");
                            
break;
                
}

                

}
        
}
        
catch(Exception e) 
{
            
System.out.println("Exception: " + e);
        
}
    
}
}