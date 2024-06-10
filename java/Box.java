class Box
{
    double weight;
    double height;
    double breadth;
    Box()/*this is the default constructor for the Box */
    {
        System.out.println("Constructing Box");
        weight=100;
        height=100;
        breadth=100;
    }
    double volume()
    {
        return weight*height*breadth;
    }
}
class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol1,vol2;
        vol1=mybox1.volume();
        vol2=mybox2. volume();
        System.out.println("Volume of the first box is"+vol1);
        System.out.println("Volume of the second box is"+vol2);
    }
}