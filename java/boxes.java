// package multilevel;

class Boxes {
    double width, height, depth;

    Boxes(Box ob) {
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

class BoxWeight extends Boxes {

    double a;
    BoxWeight(BoxWeight ob){

    }
    BoxWeight(){
    super();
    }
    BoxWeight(double w, double h, double d, double a) {
        
        super(w,h,d);
        this.a = a;
    }

    
        

}
class Shipment extends BoxWeight {
    
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }
    Shipment(double w, double h, double d, double a,double c) {
        super(w, h, d, a);
        cost=c;
    }
    double volume(){
        return height*depth*height;
    }
    Shipment(){
        super();
        cost=-1;
    }
    // shipment(double len,double m,double c){
    //     super(len,m);
    //     cost=c;
    // }
    
}


class DemoShipment {
    public static void main(String[] args) {
        Shipment Shipment1=  new Shipment(10,20,15,10,3.41);
        Shipment Shipment2=  new Shipment(2,3,4,5,6);
        double vol;
        vol= Shipment1.volume();
        System.out.println("Volume of shipment is :"+vol);
        System.out.println("width of shipement2:"+ Shipment2.width);

        System.out.println("width of shipement1:"+ Shipment1.width);
    }
}
