package livraison;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("test", 15, DishSize.LARGE);
        System.out.println(dish);
    }
}

// ##Partie 2:

// Modélisation Orientée

// Objet (Séance 2)

// *Objectif : Appliquer les principes de la POO pour construire le cœur du
// système.*

// ### Question 4 : "Le Cœur du Système : Les Objets Métier"

// Modélisez les objets principaux de FoodFast. **Pour chaque classe,
// implémentez un constructeur, `equals()`, `hashCode()` et `toString()`, et
// écrivez les tests JUnit associés.**

// 1. **`enum DishSize { SMALL, MEDIUM, LARGE }`**
// 2. **`class Dish`** : `String name`, `BigDecimal price`, `DishSize size`.
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
