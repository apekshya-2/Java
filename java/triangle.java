class Triangle{
    int length;
    int breadth;
    int height;
    public Triangle(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public int Area()
    {
        return breadth*height/2;
    }
    public int Perimeter()
    {
        return length+breadth+height;
    }
}
class MainTriangle
{
    public static void main(String args[])
    {
        Triangle MainTriangle=new Triangle(3,4,5);
        System.out.println("--find area and perimeter--");
        System.out.println("Area="+MainTriangle.Area());
        System.out.println("perimeter="+MainTriangle.Perimeter());

    }
}