class Rectangle{
    int length;
    int breadth;
    Rectangle(length l, breadth b)
    {
        System.out.println("creating a name");
        length=l;
        breadth=b;
    }
    area()
    {
        return length*breadth;
    }

}
class RectangleA{
    public static void main(String args[])
    {
        Rectangle Re1=new Rectangle(4,5);
        Rectangle Re2=new Rectangle(5,8);
        area;
        area=Re1.area();
        System.out.println("area of first"+area);
        area=Re2.area();
        System.out.println("area of second"+area);


    }
}