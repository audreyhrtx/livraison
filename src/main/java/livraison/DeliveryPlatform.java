package livraison;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DeliveryPlatform {

    Map<String, Order> orders;
    int cpt = 0;

    void placeOrder(Order order) {
        cpt++;
        orders.put("Commande" + cpt, order);
        Restaurant restaurant = new Restaurant();
        try {
            restaurant.prepare(order);
        } catch (Exception e) {
            order.status = OrderStatus.CANCELLED;
            System.out.println(e.getMessage());
        }

    }

    Optional<Order> findOrderById(String orderId) {
        return Optional.ofNullable(orders.get(orderId));
    }

    List<Order> findOrdersByCustomer(Customer customer) {
        return orders.values().stream()
                .filter(order -> order.customer.equals(customer))
                .toList();
    }

    List<Order> findOrdersByStatus(OrderStatus status) {
        return orders.values().stream()
                .filter(order -> order.status.equals(status))
                .toList();
    }

    // Dans `DeliveryPlatform`, lors de l'ajout d'une commande, appelez cette
    // méthode et utilisez un bloc `try-catch` pour gérer l'erreur (par exemple, en
    // passant la commande au statut `CANCELLED` et en affichant un message).

}
