//WAP to find the number of vowels present in a string entered by a user.
import java.io.*;

import jdk.internal.org.jline.utils.InputStreamReader;
class vowels1
{
    public static void main(String args[])
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string :");
        String s=in.readLine();
        int length=s.length();
        int count=0;
        for(int i=0;i<length;i++)
        {
            char ch=s.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            count++;
        }
        System.out.println("Total Vowels is : "+count);
    }
}