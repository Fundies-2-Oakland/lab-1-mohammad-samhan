public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(1.0, 3.0, 1.0);
        System.out.println("x: " + vector.getX() + ", y: " + vector.getY() + ", z: " + vector.getZ());
    }
}
