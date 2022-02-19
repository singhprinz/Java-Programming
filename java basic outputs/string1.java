// WAP to count the number of Alphabets and digits in a user defined string.
import java.util.*;
class string1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s=in.next();
        int numbercount=0, alphabetcount=0;
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
                alphabetcount++;
            if(Character.isDigit(ch))
                numbercount++;
        }
        System.out.println("Total Alphabets :"+numbercount);

    }
}