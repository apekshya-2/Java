class classBox
{
    private int length;
    private int breadth;
    private int height;

    public void Setdata(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
    }

    public int FindArea()
    {
        return 2 * (length * breadth + length * height + breadth * height);
    }

    public int FindVolume()
    {
        return (length * breadth * height);
    }
}

class Mainbox
{
    public static void main(String[] args)
    {
        classBox BoxObj1 = new classBox();
        classBox BoxObj2 = new classBox();
        BoxObj1.Setdata(5, 2, 9);
        BoxObj2.Setdata(9, 4, 5);
        System.out.println("--First Box--");
        System.out.println("Area=" + BoxObj1.FindArea());
        System.out.println("Volume=" + BoxObj1.FindVolume());
        System.out.println("--Second Box--");
        System.out.println("Area=" + BoxObj2.FindArea());
        System.out.println("Volume=" + BoxObj2.FindVolume());
    }
}
