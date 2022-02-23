// chatclient program
import java.io.*;
import java.net.*;
class ChatClient1
{
    Socket soc;
    public ChatClient1()
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            soc=new Socket("127.0.0.1",2010);
            while(true)
            {
                ObjectOutputStream oos=new ObjectOutputStream(soc.getOutputStream());
                System.out.println("Type messages ");
                String msg=dis.readLine();
                oos.writeObject(msg);
                ObjectInputStream ois=new ObjectInputStream(soc.getInputStream());
                String str=(String)ois.readObject();
                System.out.println(str);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
    public static void main(String args[])
    {
        new ChatClient1();
    }
}