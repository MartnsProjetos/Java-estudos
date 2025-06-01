import java.util.Scanner;

public class ConversorMoeda {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("-------------------------------------------");
            System.out.println("**Convertor de Real para dolár**");
            Conversor conversor = new Conversor();
            conversor.lerValor();
            System.out.println("Valor convertido em Dólar: $" + String.format("%.2f", conversor.getCotacaoDolar()).replace('.', ','));
            System.out.println("-------------------------------------------");

            System.out.println("\nDigite 0 para Reiniciar e 1 Para Encerrar.");
            numero = scanner.nextInt();
            if (numero == 1) {
                System.out.println("Encerrando...");
            } else {
                //System.out.println("Reiniciando...");
            }

        } while (numero == 0);
         scanner.close();




    }
}


