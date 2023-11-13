package ss6_ke_thua.bai_tap.Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Radius: " + this.getRadius() + "; color: " + this.getColor() + "; height: " + this.getHeight();
    }

}

