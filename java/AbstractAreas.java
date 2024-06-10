abstract class figure {
    double dim1;
    double dim2;

    figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}

class Tringle extends figure {
    Tringle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("inside Area for tringle");
        return (dim1 * dim2) / 2;
    }
}

class AbstractAreas {
    public static void main(String[] args) {
        figure f1 = new Rectangle(10, 10);
        figure f2 = new Tringle(10, 10);
        double area;
        area = f1.area();
        System.out.println("area of rectangle" + area);
        area = f2.area();
        System.out.println("area of tringle" + area);
    }
}