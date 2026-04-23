package AbstractClass_interface.colorable;

public class Square extends Shape implements Colorable {
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public void HOWToColor() {
        System.out.println("Tô màu 4 cạnh hình vuông");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
