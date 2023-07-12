import java.util.Random;

//Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux nombres pairs suivis par un nombre impair.
// Si ce n’est pas le cas, recommencer jusqu’à ce que vous ayez la combinaison pair, pair, impair.
// Afficher ensuite le nombre d’essais nécessaires pour obtenir cette combinaison.
public class GenerationNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(1001);
        int twoNumber = random.nextInt(1001);
        int threeNumber = random.nextInt(1001);

        int count = 0;

        while (true) {
            int num1 = random.nextInt(1001); // Générer un nombre aléatoire entre 0 et 1000
            int num2 = random.nextInt(1001);
            int num3 = random.nextInt(1001);
            count++; // Incrémenter le compteur d'essais

            if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 != 0) {
                // Vérifier si num1 et num2 sont pairs et num3 est impair
                System.out.println("Combinaison trouvée !");
                break; // Sortir de la boucle si la combinaison est trouvée
            }
        }

        System.out.println("Nombre d'essais nécessaires : " + count);
    }
}