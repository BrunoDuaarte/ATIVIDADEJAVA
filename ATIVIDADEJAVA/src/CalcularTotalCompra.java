import java.util.Scanner;

public class CalcularTotalCompra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de produtos comprados: ");
        int quantidadeProdutos = scanner.nextInt();
        
        double valorTotal = 0.0;
        
        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double precoProduto = scanner.nextDouble();
            valorTotal += precoProduto;  
        }
        
        System.out.println("O valor total a ser pago é: R$ " + valorTotal);
    
        scanner.close();
    }
}
