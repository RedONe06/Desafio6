package Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cod;
        double n1, n2, n3, mp, maior, Smenor;
        String condicao;
        
        condicao = "";
        cod = 0;
        mp = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o código do aluno: ");
        cod = input.nextInt();

        while (cod >= 0) {
            System.out.println("Insira a primeira nota: ");
            n1 = input.nextInt();
            System.out.println("Insira a segunda nota: ");
            n2 = input.nextInt();
            System.out.println("Insira a terceira nota nota: ");
            n3 = input.nextInt();

            if (n1 > n2 && n1 > n3) {
                maior = n1;
                Smenor = n2 + n3;
            } else if (n2 > n3) {
                maior = n2;
                Smenor = n1 + n3;
            } else {
                maior = n3;
                Smenor = n2 + n1;
            }
            
            mp = (maior*4 + Smenor*3)/10; 

            if (mp >= 5) {
                condicao = "Aprovado";
            } else {
                condicao = "Desaprovado";
            }
            
            System.out.println("n1: " + n1
                    + "\nn2: " + n2
                    + "\nn3: " + n3
                    + "\nmedia: " + mp
                    + "\nsituação: " + condicao);
            
            System.out.println("Insira o código do aluno: ");
            cod = input.nextInt();
        }
        System.out.println("código negativo, saindo");
    }
}
