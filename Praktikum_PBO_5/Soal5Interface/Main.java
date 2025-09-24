public class Main {
    public static void main(String[] args) {
        // Membuat objek Food
        Food snack = new Food("Chocolate Bar", 1.50, 250);
        System.out.println("--- Detail Makanan ---");
        snack.display();
        System.out.println();

        // Membuat objek Toy
        Toy actionFigure = new Toy("Action Figure", 19.99, 6);
        System.out.println("--- Detail Mainan ---");
        actionFigure.display();
        System.out.println();

        // Membuat objek Book
        Book novel = new Book("The Lord of the Rings", 25.00, "J.R.R. Tolkien");
        System.out.println("--- Detail Buku ---");
        novel.display();
    }
}