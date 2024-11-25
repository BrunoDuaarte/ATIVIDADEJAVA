import java.util.Scanner;

public class VerificarAptidaoParaVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade de " + nome + ": ");
        int idade = scanner.nextInt();
        
        if (idade >= 16) {
            System.out.println(nome + " é apto para votar.");
        } else {
            System.out.println(nome + " não é apto para votar.");
        }
        
        scanner.close();
    }
}

