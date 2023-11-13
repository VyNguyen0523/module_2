package ss6_ke_thua.bai_tap.LopPoint2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        z = 0.0f;
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void getXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { super.getX(), super.getY(),this.z};
    }
    @Override
    public String toString() {
        return "Point3D [x = " + super.getX() + "; y = " + super.getY() + "; z = " + this.z + "]";
    }

    public void setXYZ(int i, int i1, int i2) {
    }
}
