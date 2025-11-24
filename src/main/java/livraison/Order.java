package livraison;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

// * Ajoutez une méthode `BigDecimal calculateTotalPrice()`.

public class Order {
    OrderStatus status;
    Map<Dish, Integer> dishes;
    Customer customer;
    LocalDateTime orderDate;

    public Order(Map<Dish, Integer> dishes, Customer customer) {
        this.status = status.PENDING;
        this.dishes = dishes;
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal res = new BigDecimal(0);
        for (Map.Entry<Dish, Integer> entry : dishes.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                Dish dish = entry.getKey();
                res.add(dish.getPrice());

            }
        }
        return res;

    }

}
