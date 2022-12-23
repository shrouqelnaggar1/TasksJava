
package circleinhertance;


public class cylinder extends circle {
    double height;

    public cylinder() {
    }

    public cylinder(double height) {
        this.height = height;
    }

    public cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume (double height)
    { double area =this.getArea(radius);
        return area * height;}
}
