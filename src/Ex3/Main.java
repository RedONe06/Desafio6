package Ex3;

import java.util.Scanner;

/**
 * @author andri
 */
public class Main {
    public static void main(String[] args) {
        int cod, n, deb, cred;
        cod = 1;
        deb = 0;
        cred = 0;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Digite o valor: ");
            n = input.nextInt();
            
            System.out.println("Digite o código: "
                    + "\n(1)Débito"
                    + "\n(2)Crédito"
                    + "\n(0)Fim");
            
            cod = input.nextInt();
            
            switch(cod){
                case 1:
                    deb += n;
                    break;
                case 2:
                    cred+= n;
                    break;
                case 0:
                    cod = 0;
                    break;
                default:
                    System.out.println("Código inválido");
            }
        }while(cod!=0);
        
        System.out.println("Debitos: " + deb +
                "\nCréditos: " + cred +
                "\nSaldo: " + (cred-deb));
        
    }
}
