class FloatingPoint{
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println("Nilai x (sebelum dibulatkan) = " + x);
        System.out.println("Nilai nx (setelah dibulatkan dan dicast) = " + nx);
    }
}