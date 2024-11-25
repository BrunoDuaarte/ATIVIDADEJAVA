import java.util.Scanner;

public class VerificarMultiploDe5 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é múltiplo de 5
        if (numero % 5 == 0) {
            System.out.println(numero + " é múltiplo de 5.");
        } else {
            System.out.println(numero + " não é múltiplo de 5.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

