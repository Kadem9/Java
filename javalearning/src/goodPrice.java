import java.util.Random;
import java.util.Scanner;

//Creez un juste prix en console avec un affichage du temps et
// du nombre de tentatives mises par l'utilisateur pour trouver le juste prix.
public class goodPrice {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Print a number between 1 and 20");

    long debut = System.currentTimeMillis();

    int count = 0;
    int exactNumber = 15;

    int number = input.nextInt();
    System.out.println("Your number is : "+ number);

    while(number != exactNumber){
        // is not good
        System.out.println("Is not a good number, please rewait : ");
        number = input.nextInt();
        count++;
        }
        // Succes
        long fin = System.currentTimeMillis();
        long tempsTotal = (fin - debut) / 1000; // Convertit le temps en secondes
        System.out.println("Temps écoulé : " + tempsTotal + " secondes.");
        System.out.println("Congrulations, is a good number !!");
        System.out.println("You have use " + count + " attempt");
    }
}