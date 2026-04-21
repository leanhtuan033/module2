package AbstractClass_interface.Resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Object[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        Random rd = new Random();

        for (Object obj : shapes) {

            double percent = rd.nextInt(100) + 1;

            // Hình tròn
            if (obj instanceof Circle) {
                Circle c = (Circle) obj;
                System.out.println("Diện tích hình tròn trước: " + c.getArea());
                c.resize(percent);
                System.out.println("Sau khi tăng (" + percent + "%): " + c.getArea());
            }

            // Hình chữ nhật
            else if (obj instanceof Rectangle) {
                Rectangle r = (Rectangle) obj;
                System.out.println("Diện tích hình chữ nhật trước: " + r.getArea());
                r.resize(percent);
                System.out.println("Sau khi tăng (" + percent + "%): " + r.getArea());
            }

            // Hình vuông
            else if (obj instanceof Square) {
                Square s = (Square) obj;
                System.out.println("Diện tích hình vuông trước: " + s.getArea());
                s.resize(percent);
                System.out.println("Sau khi tăng (" + percent + "%): " + s.getArea());
            }

            System.out.println("----------------------");
        }
    }
}
