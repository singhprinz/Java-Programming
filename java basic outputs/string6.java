//WAP to take a word from the user and arrange all its alphabets in ascending order
import java.io.*;

import jdk.internal.org.jline.utils.InputStreamReader;
class string6
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=in.readLine();
        s=s.toUpperCase();
        int length=s.length();
        char ch;
        for(int i=65;i<90;i++)
        {
            for(int i=0;i<length;i++)
            {
                ch=s.charAt(i);
                if(ch==(char)i||ch==(char)(i+32));
                System.out.println(ch);
            }
        }

    }
}