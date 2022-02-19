//WAP for number to word converter
import java .io.*;
class NumbertoWord
{
    String x[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    String y[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String z[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public static void main(String args[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any integer number :");
        int num=Integer.parseInt(in.readLine());
        NumbertoWord obj=new NumbertoWord();
        obj.display(num);
    }
    void display(int n)
    {
        if((n>=1)&&(n<=9))
        System.out.print(x[n]);
        if((n>=10) && (n<=19))
        System.out.print(y[n%10]);
        if((n>=20)&& (n<=99))
        {
            System.out.print(z[n/10]+" ");
            System.out.print(x[n%10]);
        }
        if((n>=100)&&(n<=999))//three digit number
        {
            display(n/100);
            System.out.print(" Hundred ");
            display(n%100);
        }
        if((n>=1000) && (n<=9999))//four digit number
        {
            display(n/1000);
            System.out.print(" Thousand ");
            display(n%1000);
        }
        if((n>=10000)&& (n<=99999))//five digit number
        {
            display(n/1000);
            System.out.print(" Thousand ");
            display(n%1000);
        }
        if((n>=100000)&& (n<=999999))//six digit number
        {
            display(n/100000);
            System.out.print(" Lakh ");
            display(n%100000);
        }
        if((n>=1000000) && (n<=9999999))//seven digit number
        {
            display(n/100000);
            System.out.print(" Lakh ");
            display(n%100000);
        }
    }
}