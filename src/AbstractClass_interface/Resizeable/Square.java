package AbstractClass_interface.Resizeable;

public class Square implements Resizeable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }




    @Override
    public void resize(double percent) {
        side = side * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Hình vuông cạnh =" + side;
    }
}
