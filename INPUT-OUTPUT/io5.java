//WAP to read thte file using single read method
import java.io.*;
class io5
{
    public static void main (String args[])
    {
        io5 obj=new io5();
        obj.readData("file.txt");
    }
    public void readData(String filepath)
    {
        try
        {
            FileInputStream fis=new FileInputStream(filepath);
            int x=-1;
            while((x=fis.read())!=-1)
            {
                System.out.print((char)(x));
            }
        } 
        catch (Exception e)
        {

        }
        
    }
}