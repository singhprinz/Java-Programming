/* WAP to copy the file or create duplicate file
create a blank file
read data from existing file
write/append data in blank file
*/
import java.io.*;
class io6
{
    public static void main(String args[])
    {
        io6 obj=new io6();
        obj.copyFile("file.txt","duplicate.doc");


    }
    public void copyFile(String originalfilepath, String duplicatefilepath)
    {
        try
        {
            FileInputStream fis=new FileInputStream(originalfilepath);
            FileOutputStream fos=new FileOutputStream(duplicatefilepath);
            int x=-1; //EOF
            while((x=fis.read())!=-1)
            {
                fos.write((char)(x));
            }

        }
        catch (Exception e)
        {
            //TODO: handle exception
        }
    }
}