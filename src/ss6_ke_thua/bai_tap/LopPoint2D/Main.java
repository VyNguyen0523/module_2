package ss6_ke_thua.bai_tap.LopPoint2D;

public class Main {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(5, 5);
        System.out.println(point2d);
        point2d.setXY(6,6);
        System.out.println(point2d);
        Point3D point3d = new Point3D(2,2,2);
        System.out.println(point3d);
        point3d.setXYZ(2,2, 2);
        System.out.println(point3d);
    }
}
