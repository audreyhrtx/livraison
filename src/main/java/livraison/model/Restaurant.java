package livraison.model;

import livraison.order.Order;
import livraison.order.OrderPreparationException;

public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant() {
        this("restaurant");
    }

    // `prepare(Order order)` qui simule une préparation.
    // VERIF
    public void prepare(Order order) throws OrderPreparationException {
        int r = (int) (Math.random() * 100);
        if (r <= 20)
            throw new OrderPreparationException();
    }
}