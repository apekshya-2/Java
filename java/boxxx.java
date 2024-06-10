class Boxes {
    double width, height, depth;

    Boxes(Boxes ob) {
        height = ob.height;
        width = ob.width;
        depth = ob.depth;

    }

    Boxes(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Boxes() {
        width = -1;
        height = -1;
        depth = -1;

    }
}

class NextBox extends Boxes {

    double a;

    NextBox(double w, double h, double d, double a) {
        super();
        this.a = a;
    }

    

}

public class Box {
    public static void main(String[] args) {
        NextBox inputBox = new NextBox(2, 3, 4, 5);
        System.out.println((inputBox.width));
    }
}