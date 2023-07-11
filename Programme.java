public class Programme {

    // Variable d'instance
    // Varaible de classe

    // Main method, static
    public static void main(String[] args) {
        System.out.println("Hello World");

        // tablerau en 2D
        int[][] tab = new int[3][4];
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[0][2] = 3;
        tab[0][3] = 4;
        tab[1][0] = 5;
        tab[1][1] = 6;
        tab[1][2] = 7;
        tab[1][3] = 8;
        tab[2][0] = 9;
        tab[2][1] = 10;
        tab[2][2] = 11;
        tab[2][3] = 12;
        int val = tab[1][2]; // expected 7
    }

}