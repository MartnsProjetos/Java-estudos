O Java possui um pacote chamado java.io, que é um dos pacotes mais importantes da linguagem, pois fornece classes e interfaces para entrada e saída de dados em vários formatos, como arquivos, rede, teclado, dentre outros. Vamos conhecer as principais classes desse pacote.

A classe File
A classe File representa um arquivo ou diretório no sistema de arquivos do computador, permitindo que você crie, delete, liste e manipule arquivos e diretórios. Para criar um objeto File, você precisa passar o caminho do arquivo ou diretório como argumento para o construtor. Por exemplo:

File file = new File("C:\\meuArquivo.txt");
Copiar código
No código anterior, foi criado um objeto File que aponta para o arquivo "meuArquivo.txt" localizado na raiz do disco C:.

A classe File tem vários métodos úteis para interagir com arquivos e diretórios, como exists(), canRead(), canWrite(), isDirectory(), isFile(), mkdir() e delete().

As classes FileReader e FileWriter
As classes FileReader e FileWriter são usadas para ler e escrever dados em arquivos de texto, sendo que a classe FileReader lê os caracteres de um arquivo de texto, enquanto a classe FileWriter escreve os caracteres.

Para usar a classe FileReader, você precisa criar um objeto passando um objeto File que deseja ler como argumento. Em seguida, você pode ler os dados do arquivo usando o método read() ou read(char[]). Por exemplo:

File file = new File("C:\\meuArquivo.txt");
FileReader reader = new FileReader(file);

int data = reader.read();
while (data != -1) {
    System.out.print((char) data);
    data = reader.read();
}
reader.close();
Copiar código
No código anterior, é feita a leitura do conteúdo do arquivo "meuArquivo.txt" e seu conteúdo é impresso no console.

Já a classe FileWriter segue o mesmo processo, porém fazendo o caminho inverso, ou seja, escrevendo caracteres no arquivo. Por exemplo:

File file = new File("C:\\saida.txt");
FileWriter writer = new FileWriter(file);
writer.write("Olá, mundo!");
writer.close();
Copiar código
No código anterior, é escrito uma mensagem no arquivo chamado "saida.txt".

O pacote java.io também fornece outras classes úteis, como:

BufferedReader e BufferedWriter: são usadas para ler e gravar arquivos de texto de maneira eficiente, lendo e escrevendo uma linha por vez. Elas usam um buffer para armazenar os dados, o que torna a leitura e escrita mais rápida do que quando feita um caractere por vez;

FileInputStream e FileOutputStream: são usadas para ler e gravar dados binários em um arquivo. Eles são usados para ler e gravar dados em arquivos que não são de texto, como imagens e arquivos de áudio;

ObjectInputStream e ObjectOutputStream: são usadas para ler e gravar objetos em arquivos. Isso permite que você armazene objetos Java em arquivos para uso posterior ou para transferência entre diferentes aplicações.

Claro, além dessas há também a classe FileWriter, que foi utilizada no curso para a escrita simples de um arquivo no computador, e também a classe Scanner, que é utilizada para ler arquivos do computador de uma maneira simples e será explicada posteriormente no curso.
