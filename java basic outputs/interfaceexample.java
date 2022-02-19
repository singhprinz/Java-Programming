//Interface example
interface area 
{
    final static float pi=3.14f; // constant data member
    float Area(float x,float y); // abstract method
}
class circle implements area
{
    public float Area(float x, float y)
    {
        return (pi*x*x);
    }
}
class rectangle implements area
{
    public float Area(float x, float y)
    {
        return (x*y);
    }
}
class interfaceexample 
{
    public static void main(String args[])
    {
        circle c=new circle();
        rectangle r=new rectangle();
        System.out.println("The area of circle" +c.Area(5.0f,0.0f));
        System.out.println("The area of rectangle" +r.Area(5.0f,6.0f));

    }
}