//WAP to illustrate the use of function overloading
class FunctionOverloading1
{
    public void sum(int x, int y)
    {
        System.out.println(x+y);
    }
    public void sum(float a, float b)
    {
        System.out.println(a+b);
    }
    public void sum(String s1, String s2)
    {
        System.out.println(s1+s2);
    }
    public static void main(String args[])
    {
        FunctionOverloading1 obj1=new FunctionOverloading1();
        obj1.sum(5, 6);
        obj1.sum("Amit","Singh" );
        obj1.sum(3.25f,6.25f);
    }
} 