// Taking input from user using DataInputStream
import java.io.*;
class pgm2
{
    public static void main(String args[]) throws Exception
    {
        DataInputStream in=new DataInputStream(System.in) ;
        System.out.print("Enrter your name:");
        String name=in.readLine();
        System.out.println("Welcome "+name);
    
    }
}