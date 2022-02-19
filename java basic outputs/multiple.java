//multiple inheritance
class A
{
    void displayA()
    {
        System.out.println("I am in A class");
    }
}
class B
{
    void displayB()
    {
        System.out.println("I am in B class");
    }
}
class C extends A,B
{
    void displayC()
    {
        System.out.println("I am in C class");
    }
    public static void main(String args[])
    {
        C obj=new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    
    }
}