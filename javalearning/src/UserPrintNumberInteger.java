import java.util.Random;
import java.util.Scanner;
public class UserPrintNumberInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, send a number integer");

        int ent = scanner.nextInt();

        double decimal = ent;

        String str = Integer.toBinaryString(ent);
        String oct = Integer.toOctalString(ent);
        String hex = Integer.toHexString(ent);

        System.out.println(str + " en binaire");
        System.out.println(oct + " octale");
        System.out.println(hex + " hexadecimale");
    }
}




