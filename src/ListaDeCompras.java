import java.util.Scanner;
import java.util.Arrays;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanatas listas de teste gostaria de fazer? Digite o número: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite a lista de compras separada por espaço: ");
            String listaDeCompra = scanner.nextLine();
            String[] itens = listaDeCompra.split(" ");

            Arrays.sort(itens); // Ordenar os itens em ordem alfabética


            // Remover itens duplicados e imprime a lista de compras
            System.out.print("Sua lista de compras organizada é: ");
            for (int x = 0; x < itens.length; x++) {
                // Verifica se é o primeiro item ou se o item é diferente do anterior
                if (x == 0 || !itens[x].equals(itens[x - 1])) {
                    System.out.print(itens[x] + " - ");
                }
            }

            System.out.println(); // Pular uma linha para a próxima lista de compras
        }

    }
}
