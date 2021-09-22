package thaivu;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    private double side;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength(double side) {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*this.length;
    }
    public double getPerimeter(){
        return 2*(width+this.length);
    }

    @Override
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength(side)
                + ", which is a subclass of "
                + super.toString();
    }
}
