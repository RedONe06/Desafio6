package Ex5;

import java.util.Scanner;
/**
 * @author andri
 */
public class Main {

    public static void main(String[] args) {
        
        int n, higher, lower, i;
        double ac;
        
        n = 0;

        higher = 0;
        lower = 0;
        ac = 0;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < 500 && n >= 0; i++) {

            System.out.println("Forneça um número positivo");
            n = input.nextInt();

            ac += n;

            if (i == 0) {
                higher = n;
                lower = n;
            }
            if (n > higher) {
                higher = n;
            }
            if (n < lower) {
                lower = n;
            }
        }
        
        ac = ac / 4.0;
        System.out.println("Números: " + (i)
                + "\nMaior: " + higher
                + "\nMenor: " + lower
                + "\nMedia: " + ac);
    }
}
