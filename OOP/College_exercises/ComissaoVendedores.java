package OOP.College_exercises;

import java.util.Scanner;

public class ComissaoVendedores {
    public static void main(String[] args) {
        double comissao = 5.0 / 100.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o preço unitario: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade vendida: ");
        int qntdVendida = scanner.nextInt();

        System.out.print("Qual o ID do vendedor: ");
        int vendedorId = scanner.nextInt();

        double totalVenda = precoUnitario * qntdVendida;
        double totalComissao = comissao * totalVenda;

        System.out.printf("O valor da comissão do vendedor %d é %.2f R$%n", vendedorId, totalComissao);
        
        scanner.close();
    }
}

