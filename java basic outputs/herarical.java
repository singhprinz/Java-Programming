//Herarical Inheritance
class Principal
{
    void displayA()
    {
        System.out.println("I am principal");
    }
}
class DeanPD extends Principal
{
    void displayB()
    {
    System.out.println("I am Dean Planning and Development");
    }
}
class DeanA extends Principal
{
    void displayC()
    {
        System.out.println("I am Dean Acadmecis");
    }
}
class F1 extends DeanPD
{
    void displayD()
    {
        System.out.println("I am faculty 1");
    }
}
class F7 extends DeanA
{
    void displayE()
    {
        System.out.println("I am Faculty 7");
    }
}
class Herarical
{
    public static void main (String args[])
    {
        F1 obj1=new F1();
        F7 obj2=new F7();
        obj1.displayA();
        obj1.displayB();
        obj1.displayD();
        obj2.displayA();
        obj2.displayC();
        obj2.displayE();
        
    }
}