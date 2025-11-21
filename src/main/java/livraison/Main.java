package livraison;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("test", new BigDecimal(15), DishSize.LARGE);
        System.out.println(dish);
    }
}

// ##Partie 2:

// Modélisation Orientée

// ### Question 4 : "Le Cœur du Système : Les Objets Métier"

// 3. **`class Customer`** : `String id`, `String name`, `String address`.
// 4. **`enum OrderStatus { PENDING, IN_PREPARATION, COMPLETED, CANCELLED }`**
// 5. **`class Order`** :
// * `String id` (généré avec `UUID.randomUUID().toString()`).
// * `OrderStatus status` (initialisé à `PENDING`).
// * `Map<Dish, Integer> dishes` (pour stocker les plats et leur quantité).
// * `Customer customer`.
// * `LocalDateTime orderDate`.
// * Ajoutez une méthode `BigDecimal calculateTotalPrice()`.

// *Concepts-clés : POO, Encapsulation, `enum`, `Map`, `BigDecimal`,
// `LocalDateTime`, `UUID`.*
