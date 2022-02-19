// WAP to display a new string after reversing the characters of each word.
import java.io.*;
class string3
{
    public static void main(String args[])
    {

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        extracted2();
        String s=in.readLine();
        char ch;
        String output=" ",word=" ",temp;
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                output=output+" "+word;
                word=" ";            }
            }
            
            {
                word=ch+word;
            }
    }

    private static void extracted2() {
        extracted();
    }

    private static void extracted() {
        System.out.println("Enter any string : ");
    }
    System.out.println("Original String is : "+s);
    System.out.println("Resultant String is : "+output);
        
    
}