public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); // Memanggil constructor Rectangle(width, length)
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return getWidth(); // Sisi persegi bisa diambil dari width atau length
    }
    
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    
    // Override setWidth dan setLength agar nilai width dan length selalu sama
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
    
    // getArea() dan getPerimeter() tidak perlu di-override karena
    // perhitungan dari Rectangle sudah benar jika width == length.
}