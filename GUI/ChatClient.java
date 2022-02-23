// chatClient Program
import java.net.*;
import java.io.*;
class ChatClient
{
    Socket client;
    public ChatClient()
    {
        try
        {
            client=new Socket("127.0.0.1",2006);
            ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
            oos.writeObject("Hi !");


        }
        catch(Exception e)
        {

        }
    }
    public static void main(String args[])
    {
        new ChatClient();
    }
}