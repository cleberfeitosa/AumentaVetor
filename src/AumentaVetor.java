
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Cleber Feitosa
 */
public class AumentaVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNotas = 0;
        double nota = 0;
        double[] notas = new double[2];
        int posicao = 0;
        totalNotas = 0;
        mensagemBoasVindas();
        //rodando o programa enquanto não for informado -1
        do {
            System.out.print("Informe o valor da nota (-1 para encerrar o programa):");
            nota = sc.nextDouble();
            //validando nota maior que 10;
            while (nota > 10) {
                System.out.println("Nota inválida, informe novamente, com valores entre 0 e 10!");
                nota = sc.nextDouble();
            }
            //testando se nota é flag de saída e atribuindo notas no vetor notas       
            if (nota > -1) {
                notas[posicao] = nota;
                posicao++;
            }
            if(posicao > notas.length){
                Vetor vetor = new Vetor();
                vetor.garantaEspaco();
            }
        } while (nota != -1);
        //escrevendo saídas solicitadas: quantidade notas
        System.out.println("\nQuantidade de notas lidas: " + posicao + " notas.");
        //escrevendo saídas solicitadas:  notas na ordem inseridas

        System.out.println("\nNotas informads:");
        for (int i = 0; i < posicao; i++) {
            System.out.print(notas[i] + ",");
        }
        //escrevendo saídas solicitadas:  notas na ordem inversa
        System.out.println("\nNotas impressas na ordem inversa que foram informadas:");
        for (int i = posicao - 1; i >= 0; i--) {
            System.out.print(notas[i] + ",");
        }
        //calculando e exibindo soma
        int soma = 0;
        for (double o : notas) {
            soma += o;
        }
        System.out.println("\nSoma dos das notas informadas: " + soma);
        //calculando e exibindo medias
        double media = (double) soma / posicao;

        System.out.printf("\nSoma dos das notas informadas %.2f:\n", media);

        int acimaMedia = 0;
        for (int i = 0; i < posicao; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
            
        }
        System.out.println("\nQuantidade de valores acima da média:\n " + acimaMedia);

        int abaixoSete = 0;
        for (int i = 0; i < posicao; i++) {
            if (notas[i] < 7) {
                abaixoSete++;
            }
        }
        System.out.println("\nQuantidade de valores abaixo de sete: \n" + abaixoSete);
        System.out.println("Programa encerrado.");

    }

    //criando os métodos
    public static void mensagemBoasVindas() {
        System.out.println("\n\n---------------------------------------\n");
        System.out.println("Olá seja bem vindo ao nosso Sistema!!!");
        System.out.println("---------------------------------------\n");
    }
    
    //método aumentar vetor
    public static void aumentarVetor(){
        
    }

}
