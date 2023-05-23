/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cleber Feitosa
 */
import java.util.Arrays;
import java.util.Scanner;

public class VetorDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5]; // Vetor inicial com tamanho 5
        int tamanho = 5; // Tamanho atual do vetor

        System.out.println("Vetor inicial: " + Arrays.toString(vetor));

        boolean executar = true;
        while (executar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Alterar tamanho do vetor");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o elemento a ser inserido: ");
                    int elemento = scanner.nextInt();
                    if (tamanho == vetor.length) {
                        vetor = aumentarTamanhoVetor(vetor, tamanho * 2); // Dobrar o tamanho do vetor
                        tamanho = vetor.length;
                    }
                    vetor[tamanho - 1] = elemento;
                    tamanho++;
                    System.out.println("Vetor atualizado: " + Arrays.toString(vetor));
                    break;
                case 2:
                    System.out.println("Digite o novo tamanho do vetor: ");
                    int novoTamanho = scanner.nextInt();
                    if (novoTamanho < tamanho) {
                        System.out.println("O novo tamanho deve ser maior ou igual ao tamanho atual do vetor.");
                    } else {
                        vetor = aumentarTamanhoVetor(vetor, novoTamanho);
                        tamanho = novoTamanho;
                        System.out.println("Vetor atualizado: " + Arrays.toString(vetor));
                    }
                    break;
                case 3:
                    executar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("Fim do programa.");
    }

    public static int[] aumentarTamanhoVetor(int[] vetor, int novoTamanho) {
        int[] novoVetor = new int[novoTamanho];
        System.arraycopy(vetor, 0, novoVetor, 0, vetor.length);
        return novoVetor;
    }
}

