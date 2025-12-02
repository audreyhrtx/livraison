package livraison;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("test", new BigDecimal(15), DishSize.LARGE);
        System.out.println(dish);
    }
}

// ### Question 5 : "La Plateforme de Livraison"

// 1. Créez la classe `DeliveryPlatform`.
// 2. Donnez-lui une `Map<String, Order>` pour stocker les commandes en cours.
// 3. Implémentez les méthodes suivantes :
// * `void placeOrder(Order order)`
// * `Optional<Order> findOrderById(String orderId)`

// *Concepts-clés : `List`, `Map`, `Optional`.*

// ---

// ## Partie 3 : Logique Applicative et Robustesse (Séance 3)

// *Objectif : Manipuler des collections avec des fonctionnalités modernes de
// Java et rendre l'application robuste.*

// ### Question 6 : "Recherche Avancée de Commandes"

// Dans `DeliveryPlatform`, ajoutez les méthodes de recherche suivantes en
// utilisant **l'API Stream et des lambdas**.

// 1. `List<Order> findOrdersByCustomer(Customer customer)`
// 2. `List<Order> findOrdersByStatus(OrderStatus status)`

// *Concepts-clés : API Stream, `filter`, `collect`, Lambdas, `Predicate`.*

// ### Question 7 : "Gestion des Erreurs de Préparation"

// 1. Créez une exception personnalisée `OrderPreparationException`.
// 2. Dans une classe `Restaurant`, créez une méthode `prepare(Order order)` qui
// simule une préparation. Cette méthode aura 20% de chances de lancer votre
// `OrderPreparationException`.
// 3. Dans `DeliveryPlatform`, lors de l'ajout d'une commande, appelez cette
// méthode et utilisez un bloc `try-catch` pour gérer l'erreur (par exemple, en
// passant la commande au statut `CANCELLED` et en affichant un message).

// *Concepts-clés : Exceptions, `try-catch-finally`, exceptions personnalisées.*

// ---

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
