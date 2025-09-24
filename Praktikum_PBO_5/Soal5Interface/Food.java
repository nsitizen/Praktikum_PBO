public class Food extends Goods {
    private int calories;

    public Food(String description, double price, int calories) {
        super(description, price);
        this.calories = calories;
    }

    @Override
    public void display() {
        super.display(); // Memanggil method display dari Goods
        System.out.println("Calories: " + this.calories);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}