package Ex2;

import java.util.Scanner;

/**
 * @author andri
 */
public class Main {

    public static void main(String[] args) {

        int c1, c2, c3, c4, n;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        n = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Numero positivo pra continuar negativo para parar");
            n = input.nextInt();

            if (n >= 0 && n <= 25) {
                c1++;
            } else if (n >= 26 && n <= 50) {
                c2++;
            } else if (n >= 51 && n <= 75) {
                c3++;
            } else if (n >= 76 && n <= 100) {
                c4++;
            } else {
                System.out.println("entre 0 e 100");
            }

        } while (n >= 0);

        System.out.println("[0...25]: " + c1
                + "\n[26...50]: " + c2
                + "\n[51...75]: " + c3
                + "\n[76...100] + c4");
    }
}
