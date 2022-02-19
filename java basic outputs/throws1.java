import java.io.IOException;

//throws keyword
class throws1
{
    public static void main(String args[])
    {
        throws1 obj=new throws1();
        obj.A();
        System.out.println("Program end");
    }
    void A()
    {
        try
        {
            B();
        }
        catch(Exception e)
        {
            System.out.println("Exceptoin handled");
        }
    }
    void B() throws IOException
    {
         C();
    }
    void C() throws IOException
    {
        throw new IOException("Error");
    }
}
