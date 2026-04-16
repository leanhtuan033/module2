package kethua;

public class MainPoint {
    public static  void main(String[] args) {

        Point2d p2 = new Point2d(3, 4);
        System.out.println("Point2D: " + p2);
        float[] xy = p2.getXY();
        System.out.println("Array: [" + xy[0] + ", " + xy[1] + "]");

        System.out.println("------------------");

        Point3d p3 = new Point3d(1, 2, 3);
        System.out.println("Point3D: " + p3);
        float[] xyz = p3.getXYZ();
        System.out.println("Array: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");

    }
}
