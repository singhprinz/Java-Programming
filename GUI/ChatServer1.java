// Chat server program
import java.io.*;
import java.net.*;
class ChatServer1
{
    ServerSocket server;
    public ChatServer1()
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            server=new ServerSocket(2010);
            System.out.println("Server started..");
            Socket soc=server.accept();
            System.out.println("Client connected..");
            while(true)
            {
                ObjectInputStream ois=new ObjectInputStream(soc.getInputStream());
                String str=(String)ois.readObject();
                System.out.println(str);
                ObjectOutputStream oos=new ObjectOutputStream(soc.getOutputStream());
                System.out.println("Type message");
                String msg=dis.readLine();
                oos.writeObject(msg); 
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new ChatServer1(); 
    }
}