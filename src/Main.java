import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConsultaCep buscaCep = new ConsultaCep();

        System.out.println("Digite o CEP para consulta:");
        var cep = entrada.nextLine();

        try {
            Endereco novoEnd = buscaCep.buscaEndereco(cep);
            System.out.println(novoEnd);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.GeraJson(novoEnd);

        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
// CEPs utilizados:
//01311200
// 01001000