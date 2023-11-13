package ss6_ke_thua.bai_tap.Circle;

public class Circle {

    double radius;
    String color;

    public Circle() {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public String toString(){
        return "Radius: " + this.radius + "; color: " + this.color;
    }
}
