public class Circle {
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public double getRadius() { return this.radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }
    
    // Methods
    public double getArea() { return this.radius * this.radius * Math.PI; }
    @Override
    public String toString() { return "Circle[radius=" + radius + ", color=" + color + "]"; }
}