//Taking Input from user using BufferedReader class
import java.io.*;
class pgm3
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name=in.readLine();
        System .out.print("Enter your age : ");
        int age=Integer.parseInt(in.readLine());
        System.out.println("Welcome "+name);
        System.out.println("Age : "+age);
    }
}