package ss7_abtract_class_interface.bai_tap.InterfaceResizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("orange", true,2.5);
        System.out.println(square);
        System.out.println("This area: "+square.getArea());

        square.resize(100);
        System.out.println(square);
        System.out.println("This area: "+square.getArea());

    }
}
