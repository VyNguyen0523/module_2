package ss7_abtract_class_interface.bai_tap.InterfaceColorable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        squares[0] = new Square();
        squares[1] =  new Square(10.0);
        squares[2] = new Square("red",true,20.0);
        squares[3] = new Square("blue",false,20.0);
        squares[4] = new Square("blue",true,20.0);
        for (int i = 0; i < squares.length; i++
        ) {
            System.out.println("Circle at index : " + i);
            System.out.println("S: " + squares[i].getArea());
            squares[i].printColor();
        }
    }
}