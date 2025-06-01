import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

//Inicio da sofrência ;-;
public class Conversor {
    private double resposta;

    //Para ler o valor da resposta com Scanner e mandar na outra classe "ConversorMoeda.java"
    public void lerValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor em dólar para converter em reais: ");
        resposta = scanner.nextDouble();
    }

    //Entregar a resposta para a outra classe de acordo com a resposta e converter para dólar "ConversorMoeda.java"
    public double getCotacaoDolar() {
        try {
            // Chama a API :)
            URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD-BRL");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            conexao.connect();

            // Lê a resposta da API :/
            InputStream inputStream = conexao.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            StringBuilder respostaJson = new StringBuilder();
            while (scanner.hasNext()) {
                respostaJson.append(scanner.nextLine());
            }
            scanner.close();

            // Extrai o valor do campo bid :(
            String json = respostaJson.toString();
            String busca = "\"bid\":\"";
            int inicio = json.indexOf(busca) + busca.length();
            int fim = json.indexOf("\"", inicio);
            String valorString = json.substring(inicio, fim);

            double cotacao = Double.parseDouble(valorString);
            return resposta * cotacao;

        } catch (Exception e) {
            System.out.println("Erro ao buscar a cotação: " + e.getMessage());
            return -1;
        }
    }
}

//Depressão ;-;