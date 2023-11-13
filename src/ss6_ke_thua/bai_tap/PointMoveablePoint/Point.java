package ss6_ke_thua.bai_tap.PointMoveablePoint;

public class Point {
    private  float x;
    private float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(){
    }

    public float[] getXY() {
        return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return  "Point [x = " + this.x + "; y= " + this.y + "]";
    }

}
