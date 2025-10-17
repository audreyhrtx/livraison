package livraison;

public class FoodFastUtils {

    // **a) Planificateur de livraison (FizzBuzz) :** Créez une méthode `static
    // // String deliveryPlanner(int n)` qui retourne "Fizz" pour les multiples de
    // 3,
    // // "Buzz" pour les multiples de 5, et "FizzBuzz" pour les multiples des deux.
    // // Cet "algorithme" nous aidera à planifier nos lots de livraison. **Écrivez
    // les
    // tests JUnit avant d'écrire le code (TDD).**

    public static String deliveryPlanner(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "fizzbuzz";
        } else if (n % 3 == 0) {
            return "fizz";
        } else if (n % 5 == 0) {
            return "buzz";
        } else
            return "";
    }

}
