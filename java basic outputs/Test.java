//WAP to print messages from three classses without thread
class A
{
    void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("A");
        }
    }
}
class B
{
    void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("B");
        }
    }
}
class Test
{
    void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Test");
        }
    }
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        Test obj3=new Test();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}