import javax.lang.model.util.ElementScanner14;

//WAP to find the maximum numbers using function overloading
class FunctionOverloading2
{
    public void maximum(int a, int b)
    {
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
    public void maximum(int a, int b, int c)
    {
        if((a>b)&&(a>c))
            System.out.println(a);
        else if((b>a)&&(b>c))
            System.out.println(b);
        else 
            System.out.println(c);
    }
    public static void main(String args[])
    {
        FunctionOverloading2 obj=new FunctionOverloading2();
        obj.maximum(5, 6);
        obj.maximum(6,9,1);
        obj.maximum(8, 1, 3);
        
    }
}