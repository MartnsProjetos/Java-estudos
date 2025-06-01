import br.com.carros.complementos.modelos.ModeloCarro;
import br.com.carros.complementos.orcamento.Orcamento;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            // Criando os carros
            ArrayList<ModeloCarro> carros = new ArrayList<>();
            carros.add(new ModeloCarro("Celta", 2015, 22000));
            carros.add(new ModeloCarro("Palio", 2012, 18000));
            carros.add(new ModeloCarro("Gol", 2014, 21000));
            carros.add(new ModeloCarro("Uno", 2013, 17000));
            carros.add(new ModeloCarro("Fox", 2016, 28000));
            carros.add(new ModeloCarro("Onix", 2019, 42000));
            carros.add(new ModeloCarro("HB20", 2020, 47000));
            carros.add(new ModeloCarro("Ka", 2018, 31000));
            carros.add(new ModeloCarro("Sandero", 2017, 29000));
            carros.add(new ModeloCarro("Corolla", 2015, 60000));
            carros.add(new ModeloCarro("Civic", 2016, 65000));
            carros.add(new ModeloCarro("Cruze", 2017, 63000));
            carros.add(new ModeloCarro("Fit", 2014, 39000));
            carros.add(new ModeloCarro("Compass", 2019, 105000));
            carros.add(new ModeloCarro("Renegade", 2018, 85000));
            carros.add(new ModeloCarro("Toro", 2020, 112000));
            carros.add(new ModeloCarro("S10", 2016, 98000));
            carros.add(new ModeloCarro("Hilux", 2017, 130000));
            carros.add(new ModeloCarro("Strada", 2015, 46000));
            carros.add(new ModeloCarro("T-Cross", 2021, 120000));
            carros.add(new ModeloCarro("Kwid", 2020, 43000));
            carros.add(new ModeloCarro("Logan", 2016, 34000));
            carros.add(new ModeloCarro("March", 2017, 32000));
            carros.add(new ModeloCarro("Etios", 2018, 36000));
            carros.add(new ModeloCarro("Versa", 2019, 45000));
            carros.add(new ModeloCarro("Bravo", 2015, 41000));
            carros.add(new ModeloCarro("Idea", 2014, 30000));
            carros.add(new ModeloCarro("Fusion", 2016, 70000));
            carros.add(new ModeloCarro("Jetta", 2017, 76000));
            carros.add(new ModeloCarro("Tucson", 2015, 54000));
            carros.add(new ModeloCarro("Lamborguini", 2024, 5000000));


            System.out.println("Quer saber qual o melhor carro para obter agora?");
            System.out.println("1 - Sim");
            System.out.println("2 - Ver todos os carros");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor máximo que você pode pagar no carro: ");
                double valorTotal = scanner.nextDouble();

                System.out.print("Digite quanto você pode pagar por mês: ");
                double valorMensal = scanner.nextDouble();

                Orcamento.recomendarCarros(valorTotal, valorMensal, carros);
            } else if (opcao == 2) {
                for (ModeloCarro carro : carros) {
                    carro.exibaFichaTecnica();
                    System.out.println("---------------------------");
                }
            } else {
                System.out.println("Até logo!");
                break;
            }
        } while (opcao == 2);
        scanner.close();
    }
}
