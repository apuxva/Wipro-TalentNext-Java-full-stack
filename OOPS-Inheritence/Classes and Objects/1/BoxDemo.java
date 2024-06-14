/*Create a class Box that uses a parameterized constructor to initialize the 
dimensions of a box. The dimensions of the Box are width, height, depth. The 
class should have a method that can return the volume of the box. Create an 
object of the Box class and test the functionalities. */

class Box {
    double width;
    double height;
    double depth;

    Box(double w,double h,double d){
        width =w;height = h;depth=d;
    }

    double Volume() {return width * height * depth ;}
}

class BoxDemo{
    public static void main(String[] args) {
        Box myBox1 = new Box(5, 2, 4);
        Box myBox2 = new Box(10, 12, 2);
        double vol;

        vol= myBox1.Volume();
        System.out.println("Volume of Box 1 is " + vol);

        vol= myBox2.Volume();
        System.out.println("Volume of Box 2 is " + vol);
    }

}

