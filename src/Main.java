import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


        /*System.out.println("Digite a nota do aluno");
        int notaDigitada = entrada.nextInt();

        VerificarAprovacao verificarAprovacao = new VerificarAprovacao(notaDigitada);

        String resultadoFinal =verificarAprovacao.verificarNota(notaDigitada);
        System.out.println("Resultado: " +resultadoFinal );

        entrada.close();*/

        System.out.println("Digite o codigo do produto");
        int codigoDigitado = entrada.nextInt();

        CategoriasDeProdutos categoriasDeProdutos = new CategoriasDeProdutos(codigoDigitado);
        System.out.println("Cod");
    }

}




