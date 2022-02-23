//WAP to create a file and replace the existing one.
import java.io.*;
class io1
{
    public static void main(String args[])
    {
        io1 obj=new io1();
        obj.writeData("file.txt");

    }
    public void writeData(String filepath)
    {
        try
        {
        FileOutputStream fos=new FileOutputStream(filepath,true);
        }
        catch(Exception e)
        {

        }    
    }
}