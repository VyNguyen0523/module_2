package ss6_ke_thua.bai_tap.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "green");
        Cylinder cylinder = new Cylinder(2.5, "green", 2);
        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println("Thể tích hình trụ là: " + cylinder.getVolume());
        System.out.println(circle.getArea());
    }
}
