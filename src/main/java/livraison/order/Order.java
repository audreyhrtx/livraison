package livraison.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

import livraison.model.Customer;
import livraison.model.Dish;

// * Ajoutez une méthode `BigDecimal calculateTotalPrice()`.

public class Order {
    private OrderStatus status;
    private Map<Dish, Integer> dishes;
    private Customer customer;
    private LocalDateTime orderDate;

    public Order(Map<Dish, Integer> dishes, Customer customer) {
        this.status = OrderStatus.PENDING;
        this.dishes = dishes;
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Map<Dish, Integer> getDishes() {
        return dishes;
    }

    public void setDishes(Map<Dish, Integer> dishes) {
        this.dishes = dishes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal res = new BigDecimal(0);
        for (Map.Entry<Dish, Integer> entry : dishes.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                Dish dish = entry.getKey();
                res = res.add(dish.getPrice());
            }
        }
        return res;
    }

}
