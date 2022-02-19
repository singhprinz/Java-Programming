// WAP to change the class of each character of the string entered by the user. 
import java.io.*;
class string2
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string :");
        String s=in.readLine();
        int length=s.length();
        String output="";
        char ch1;
        for(int i=0;i<length;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
                ch1=Character.toUpperCase(ch);
            else if(Character.isUpperCase(ch))
                ch1=Character.toLowerCase(ch);
            else
                ch1=ch;
            output=output+ch1;
        }
        System.out.println("Origi String :"+s);
        System.out.println("Changed case String : "+output);
    }
}