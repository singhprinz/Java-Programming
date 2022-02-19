//WAP to display messages using multithread and sleep method
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try 
            {  
            System.out.println("A");
            sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                System.out.println("B");
                sleep(1000);
            }
            
            catch(Exception e)
            {

            }
            
        }
    }
}
class Test2 extends Thread
{
    public void run()
    {

        for(int i=0;i<5;i++)
        {
            try
            {
                System.out.println("Test");
                sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }

    public static void main(String args[]) 

    {
        A obj1=new A();
        B obj2=new B();
        Test2 obj3=new Test2();
        obj1.start();;
        obj2.start();;
        obj3.start();
    }
}    