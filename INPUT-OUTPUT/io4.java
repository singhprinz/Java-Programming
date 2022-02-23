//WAP to append data in the existing file
import java.io.*;
class io4
{
    public static void main(String args[])
    {
        io4 obj=new io4();
        obj.writedata("file.txt",args[0]);
    }
    public void writedata(String fileapath,String data)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream(fileapath,true);
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