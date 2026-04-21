package AbstractClass_interface.Resizeable;

public class Rectangle implements Resizeable {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }



    @Override
    public void resize(double percent) {
        width = width * (1 + percent / 100);
        height = height * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật rộng =" + width + ", cao =" + height;
    }
}
