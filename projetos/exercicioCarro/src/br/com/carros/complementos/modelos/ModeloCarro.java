package br.com.carros.complementos.modelos;

import java.text.NumberFormat;
import java.util.Locale;

public class ModeloCarro {
    private String nomeCarro;
    private int anoLancamento;
    private int precoAtual;

    public ModeloCarro(String nome, int ano, int precoAtual) {
        this.nomeCarro = nome;
        this.anoLancamento = ano;
        this.precoAtual = precoAtual;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void exibaFichaTecnica() {
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        System.out.println("Modelo: " + nomeCarro);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Preço Atual: " + formatoMoeda.format(precoAtual));
    }
}
