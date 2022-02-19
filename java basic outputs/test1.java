// wap to print message using multithread
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("A");
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("B");
        }
    }
}
class Test1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Test1");
        }
    }
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        Test1 obj3=new Test1();
        obj1.start();
        obj2.start();
        obj3.start();

    }
}