//throw keyword
class throw1
{
    void verify(int age)
    {
        if(age<18)
        throw new ArithmeticException("not eligible");
        else
        System.out.println("Eligible");  
    }
    public static void main(String args[]) 
    {
        int age=15;
        throw1 obj=new throw1();
        obj.verify(age);
        System.out.println("end of program");
    }
}