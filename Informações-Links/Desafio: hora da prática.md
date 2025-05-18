Para consolidar as ideias de classe em Java, propomos atividades práticas (não obrigatórias) que enriquecerão ainda mais sua compreensão desses princípios fundamentais.

Pronto para colocar esses conceitos em prática?

Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
Crie uma classe chamada Estudos para imprimir anotações de estudos no console.
Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.
Caso precise de ajuda, opções de solução das atividades estarão disponíveis na seção “Ver opinião do instrutor”.

Ver opinião do instrutor
Opinião do instrutor

1)
public class Perfil{

    public static void main(String[] args) {
        System.out.println("Olá, Nome");
    }

}
Copiar código
2)
public class Perfil{

    public static void main(String[] args) {
        System.out.println("Olá, Nome");
        System.out.println("Tudo bem?");
    }

}
Copiar código
3)
public class Estudos{

    public static void main(String[] args) {
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");
    }

}
Copiar código
4)
public class Soma{

    public static void main(String[] args) {
        System.out.println(10 + 5);
    }
}
Copiar código
5)
public class Subtracao{

    public static void main(String[] args) {
        System.out.println(10 - 5);
    }
}
