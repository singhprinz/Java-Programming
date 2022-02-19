//Function Overriding
class A 
{
    void display()
    {
        System.out.println("I am in A class");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("I am in class B");
    }
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        obj1.display();
        obj2.display();
    }
}
