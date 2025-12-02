package livraison;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import livraison.model.Restaurant;
import livraison.model.Customer;
import livraison.order.Order;
import livraison.order.OrderStatus;

public class DeliveryPlatform {

    Map<String, Order> orders = new HashMap<>();
    int cpt = 0;

    void placeOrder(Order order) {
        cpt++;
        orders.put("Commande" + cpt, order);
        Restaurant restaurant = new Restaurant();
        try {
            restaurant.prepare(order);
        } catch (Exception e) {
            order.setStatus(OrderStatus.CANCELLED);
            System.out.println(e.getMessage());
        }

    }

    Optional<Order> findOrderById(String orderId) {
        return Optional.ofNullable(orders.get(orderId));
    }

    List<Order> findOrdersByCustomer(Customer customer) {
        return orders.values().stream()
                .filter(order -> order.getCustomer().equals(customer))
                .toList();
    }

    List<Order> findOrdersByStatus(OrderStatus status) {
        return orders.values().stream()
                .filter(order -> order.getStatus().equals(status))
                .toList();
    }

}
