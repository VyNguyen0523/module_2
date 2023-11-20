package ss7_abtract_class_interface.bai_tap.InterfaceResizeable;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
