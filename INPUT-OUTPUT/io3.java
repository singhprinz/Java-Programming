//WAP to write the data in the file (overwriting the existing data)
import java.io.*;
class io3
{
    public static void main(String args[])
    {
        io3 obj=new io3();
        obj.writeData("file.txt",args[0]);
    }
    public void writeData(String filepath, String data)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream(filepath);
            for(int i=0;i<data.length();i++)
            {
                char ch=data.charAt(i);
                fos.write(ch);
            }

        }
        catch(Exception e)
        {

        }
        
    }
}