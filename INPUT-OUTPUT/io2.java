//WAP to create a file and replace the existing one.
import java.io.*;
class io2
{
    public static void main(String args[])
    {
        io2 obj=new io2();
        obj.writeData("file.txt");

    }
    public void writeData(String filepath)
    {
        try
        {
        FileOutputStream fos=new FileOutputStream(filepath);
        }
        catch(Exception e)
        {

        }    
    }
}