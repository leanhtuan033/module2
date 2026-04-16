package kethua;

public class MainCircle {
    public static void main(String[] args) {
        // hình tròn
        Circle c = new Circle(5, "xanh");
        System.out.println(c);
        System.out.println("Diện tích: " + c.getArea());

        System.out.println("------------------");

        // hình trụ
        Cylinder cy = new Cylinder(5, "xanh lá", 10);
        System.out.println(cy);
        System.out.println("Thể tích: " + cy.getVolume());
    }
}
