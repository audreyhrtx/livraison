package livraison;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import livraison.model.Customer;
import livraison.model.Dish;
import livraison.model.DishSize;
import livraison.order.Order;
import livraison.platform.DeliveryPlatform;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CRÉATION DES OBJETS FOODFAST ===\n");

        // Création des plats
        System.out.println("--- PLATS ---");
        Dish pizza = new Dish("Pizza Margherita", new BigDecimal("15.50"), DishSize.LARGE);
        Dish burger = new Dish("Burger Deluxe", new BigDecimal("12.00"), DishSize.MEDIUM);
        Dish salade = new Dish("Salade César", new BigDecimal("8.50"), DishSize.SMALL);

        System.out.println(pizza);
        System.out.println(burger);
        System.out.println(salade);

        // Création des clients
        System.out.println("\n--- CLIENTS ---");
        Customer client1 = new Customer("Jean Dupont", "123 Rue de la Paix, Paris");
        Customer client2 = new Customer("Marie Martin", "456 Avenue des Fleurs, Lyon");

        System.out.println(client1);
        System.out.println(client2);

        // Création d'une commande
        System.out.println("\n--- COMMANDE ---");
        Map<Dish, Integer> platsCommande = new HashMap<>();
        platsCommande.put(pizza, 2); // 2 pizzas
        platsCommande.put(burger, 1); // 1 burger
        platsCommande.put(salade, 3); // 3 salades

        Order commande = new Order(platsCommande, client1);

        System.out.println("ID: " + commande.getId());
        System.out.println("Client: " + commande.getCustomer().getName());
        System.out.println("Statut: " + commande.getStatus());
        System.out.println("Date: " + commande.getOrderDate());
        System.out.println("Prix total: " + commande.calculateTotalPrice() + "€");

        System.out.println("\nDétail des plats:");
        for (Map.Entry<Dish, Integer> entry : commande.getDishes().entrySet()) {
            System.out.println("- " + entry.getValue() + "x " + entry.getKey().getName() +
                    " (" + entry.getKey().getPrice() + "€ chacun)");
        }

        // Création de la plateforme
        System.out.println("\n--- PLATEFORME ---");
        DeliveryPlatform platform = new DeliveryPlatform();

        // Passage de la commande
        System.out.println("Passage de la commande sur la plateforme...");
        platform.placeOrder(commande);

        System.out.println("Statut après passage: " + commande.getStatus());

        System.out.println("\n=== OBJETS CRÉÉS AVEC SUCCÈS ===");
    }
}

// ## Partie 4 : Concurrence et Persistance (Séance 4)

// *Objectif : Préparer l'application à un environnement multi-utilisateurs et
// persister les données.*

// ### Question 8 : "Montée en Charge (Concurrence)"

// 1. Rendez `DeliveryPlatform` *thread-safe*. Utilisez une `ConcurrentHashMap`
// pour stocker les commandes.
// 2. Dans votre `main`, créez un `ExecutorService` avec plusieurs threads pour
// simuler plusieurs restaurants qui passent des commandes en même temps.
// 3. Assurez-vous que les méthodes qui modifient l'état de la plateforme (comme
// `placeOrder`) sont correctement synchronisées pour éviter les *race
// conditions*.
// 4. **Discussion Sécurité :** Expliquez comment une *race condition* peut
// devenir une faille de sécurité de type **TOCTOU** (Time-of-check to
// Time-of-use).

// *Concepts-clés : Concurrence, `ExecutorService`, `ConcurrentHashMap`,
// `synchronized`.*

// ### Question 9 : "Persistance en Base de Données (JDBC)"

// 1. Configurez une connexion JDBC à une base de données PostgreSQL.
// 2. Créez une méthode dans `DeliveryPlatform` qui sauvegarde une commande dans
// une table `orders`.
// 3. **Utilisez systématiquement `PreparedStatement`** pour construire vos
// requêtes.
// 4. **Discussion Sécurité :** Expliquez, avec un exemple de code, comment
// `PreparedStatement` prévient les **injections SQL** par rapport à une
// concaténation de `String`.

// *Concepts-clés : JDBC, `Connection`, `PreparedStatement`,
// `try-with-resources`.*

// ---
