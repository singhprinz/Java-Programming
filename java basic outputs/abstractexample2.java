//Abstract class and abstract method
abstract class shape
{
    abstract void Area();
}
class circle extends shape
{
    void Area()
    {
        System.out.println("Area of circle: ");
    }
}
class rectangle extends shape
{
    void Area()
    {
        System.out.println("Area of rectangle: ");
    }
}
class triangle extends shape
{
    void Area()
    {
        System.out.println("Area of triangle: ");
    }
}
class CalculateArea
{
    void displayarea(shape obj)
    {
        obj.Area();
    }
}
class abstractexample2
{
    public static void main(String args[])
    {
        CalculateArea obj=new CalculateArea();
        int choice=1;
        int choice=Integer.parseInt(args[0]);
        if(choice==1)
        obj.displayarea(new circle());
        if(choice==2)
        obj.displayarea(new rectangle());
        if(choice==3)
        obj.displayarea(new triangle());
    }
}




