public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("red", true);
        System.out.println("Shape 1: " + shape1);

        Circle circle1 = new Circle(5.5, "blue", true);
        System.out.println("\nCircle 1: " + circle1);
        System.out.println("Area: " + circle1.getArea());

        Rectangle rect1 = new Rectangle(3.0, 4.0);
        System.out.println("\nRectangle 1: " + rect1);
        System.out.println("Perimeter: " + rect1.getPerimeter());

        Square sq1 = new Square(5.0, "yellow", true);
        System.out.println("\nSquare 1: " + sq1);
        System.out.println("Area: " + sq1.getArea());
        
        // Membuktikan bahwa setWidth juga mengubah length
        sq1.setWidth(10.0);
        System.out.println("After setWidth(10): " + sq1);
    }
}