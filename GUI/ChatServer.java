
chat Server program :-
*/
import java.net.*;
import java.io.*;

class ChatServer

{
    ServerSocket server;
    public ChatServer()
    {
        try 
        {
            server =new ServerSocket(2006);
            System.out.println("Server Started");
            Socket soc=server.accept();
            System.out.println("Client Connected..");
            ObjectInputStream ois=new ObjectInputStream(soc.getInputStream());
            String clientmessage=(String)ois.readObject();
            System.out.println("Client:"+clientmessage);
        } 
        catch (Exception e) 
        {
            
        }

    }   
    public static void main(String args[])
    {
        new ChatServer();
            
    }
    
}