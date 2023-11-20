package ss7_abtract_class_interface.bai_tap.InterfaceResizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "yellow", false);
        System.out.println(circle);
        System.out.println("This area: "+circle.getArea());

        circle.resize(50.0);
        System.out.println(circle);
        System.out.println("This area: "+circle.getArea());
    }
}