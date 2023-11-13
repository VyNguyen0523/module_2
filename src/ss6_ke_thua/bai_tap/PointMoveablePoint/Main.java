package ss6_ke_thua.bai_tap.PointMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,2);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(2,2,1f,1f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
