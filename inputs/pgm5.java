//Taking Input from user using Console class
import java.io.*;
class pgm5
{
    public static void main(String args[])
    {
        Console in=System.console();
        System.out.print("Nter your name : ");
        String name=in.readLine();
        System.out.println("Welcome "+name);
    }
}