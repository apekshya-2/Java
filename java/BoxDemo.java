//call this file BoxDemo.java
class Box {

    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}

// This call declares an object of type Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        // // assign value to mybox's instance variable
        // mybox.width = 10;
        // mybox.height = 20;
        // mybox.depth = 15;
        // compute volume of box
        // vol = mybox.width * mybox.height * mybox.depth;
        vol = mybox1.volume();
        System.out.println("volume is" + vol);
        // print vol
        vol = mybox2.volume();
        System.out.println("volume is" + vol);
    }
}