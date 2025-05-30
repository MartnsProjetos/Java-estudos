package br.com.carros.complementos.orcamento;

import br.com.carros.complementos.modelos.ModeloCarro;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Orcamento {
    public static void recomendarCarros(double valorTotal, double valorMensal, ArrayList<ModeloCarro> carros) {
        System.out.println("\nCarros recomendados dentro do seu orçamento:\n");

        boolean encontrou = false;
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        for (ModeloCarro carro : carros) {
            double preco = carro.getPrecoAtual();

            // Simulação de parcelamento em até 60x com juros fictícios de 1% ao mês
            int maxParcelas = 60;
            double parcelaMensal = (preco * 0.01 * Math.pow(1.01, maxParcelas)) / (Math.pow(1.01, maxParcelas) - 1);

            if (preco <= valorTotal && parcelaMensal <= valorMensal) {
                carro.exibaFichaTecnica();
                System.out.println("Preço atual: " + formatoMoeda.format(preco));
                System.out.println("Parcela estimada: " + formatoMoeda.format(parcelaMensal) + " em até " + maxParcelas + " meses");
                System.out.println("---------------------------");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum carro se encaixa no seu orçamento no momento.");
        }
    }
}
