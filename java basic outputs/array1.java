//WAP to take 10 numbers as input in array from user and find the greatest numbers
import java.io.*;
import jdk.internal.org.jline.utils.InputStreamReader;
class array1
{
    public static void main(String args[])throws IOException
    {
        int i,max;
        int num[]=new int[10];
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the integer numbers :");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        max=num[0];
        for(i=0;i<10;i++)
        {
            if(max<num[i])
            max=num[i];
        }
        System.out.println("Max Number is "+max);
    }
}   