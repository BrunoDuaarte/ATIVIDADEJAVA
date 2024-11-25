import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 10 para ver sua tabuada: ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabuada do " + numero + ":");
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Número inválido. Digite um número de 1 a 10.");
        }
        
        scanner.close();
    }
}

