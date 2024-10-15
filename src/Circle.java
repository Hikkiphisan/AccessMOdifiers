public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public void Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getAreaCircle() {
        return 3.14150 * this.radius * this.radius;
    }

}
