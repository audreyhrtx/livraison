package livraison;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("test", new BigDecimal(15), DishSize.LARGE);
        System.out.println(dish);
    }
}
