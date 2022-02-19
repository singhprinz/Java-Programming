//Hybrid Inheritance
class A
{
    void displayA()
    {
        System.out.println("I am in class A");
    }
}
class B extends A
{
    void displayB()
    {
        System.out.println("I am in class B");
    }
}
class C extends B
{
    void displayC()
    {
        System.out.println("I am in classs C");
    }
}
class D extends C
{
    void displayD()
    {
        System.out.println("I am in class D");
    }
}
class E extends C
{
    void displayE()
    {
        System.out.println("I am in class E");
    }
}
class hybrid
{
    public static void main(String args[])
    {
        D d=new D();
        E e=new E();
        d.displayA();
        d.displayB();
        d.displayC();
        d.displayD();
        e.displayA();
        e.displayB();
        e.displayC();
        e.displayE();
    }
}
