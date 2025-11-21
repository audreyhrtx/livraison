package livraison;

public class Dish {

    private String name;
    private double price;
    private DishSize dishSize;

    public Dish(String name, double price, DishSize dishSize) {
        this.name = name;
        this.price = price;
        this.dishSize = dishSize;
    }

    public Dish(String name, DishSize dishSize) {
        this(name, 12, dishSize);
    }

    public Dish() {
        this("default", 12, DishSize.MEDIUM);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DishSize getDishSize() {
        return dishSize;
    }

    public void setDishSize(DishSize dishSize) {
        this.dishSize = dishSize;
    }

    @Override
    public String toString() {
        return "Dish [name=" + name + ", price=" + price + ", dishSize=" + dishSize +
                "]";
    }

}
