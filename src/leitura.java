// biblioteca para o 'input'
import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        // Chama a biblioteca para utilizar o 'input'
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Qual o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();
        System.out.println(anoLancamento);

        System.out.println("Diga sua avaliação do filme: ");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);

    }
}
