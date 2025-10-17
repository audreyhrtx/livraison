package livraison;

public class Main {
    public static void main(String[] args) {
        String content = "";
        for (String arg : args) {
            content += arg;
        }
        System.out.println("Hello world!" + content);
    }
}

// ### Question 1 : "Hello, FoodFast!"

// Créez une classe `Application` avec une méthode `main` qui affiche "Bienvenue
// chez FoodFast !" ainsi que les arguments passés en ligne de commande.

// *Concepts-clés : `public static void main`, `System.out.println`, compilation
// `javac` et exécution `java`.*

// ### Question 2 : "Utilitaires de Logique Métier" (avec TDD)

// Créez une classe `FoodFastUtils` qui contiendra des méthodes `static` utiles
// pour notre logique métier.

// **a) Planificateur de livraison (FizzBuzz) :** Créez une méthode `static
// String deliveryPlanner(int n)` qui retourne "Fizz" pour les multiples de 3,
// "Buzz" pour les multiples de 5, et "FizzBuzz" pour les multiples des deux.
// Cet "algorithme" nous aidera à planifier nos lots de livraison. **Écrivez les
// tests JUnit avant d'écrire le code (TDD).**

// **b) Calcul de promotions (Année Bissextile) :** Créez une méthode `static
// boolean isLeapYear(int year)` qui détermine si une année est bissextile, pour
// nos futures campagnes promotionnelles. **Écrivez les tests JUnit d'abord.**

// *Concepts-clés : Conditions `if`/`else`, opérateurs logiques et
// arithmétiques, TDD avec JUnit.*

// ### Question 3 : "Manipulation de Données"

// Toujours dans `FoodFastUtils`, ajoutez les méthodes suivantes :

// **a) Outils d'analyse :** Une méthode `static int sumUpTo(int n)` qui utilise
// une boucle pour calculer la somme de tous les entiers de 1 à n.

// **b) Anonymisation :** Une méthode `static String anonymize(String text)` qui
// inverse la chaîne de caractères passée en paramètre pour anonymiser un ID.

// *Concepts-clés : Boucles `for`/`while`, manipulation de `String`.*