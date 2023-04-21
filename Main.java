/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.unipar.trabalhoestruturadedados;

import javax.swing.JOptionPane;

/**
 *
 * @author 00239689
 */
public class Main {

    public static void main(String[] args) {

        String[] opcoes = {"InsertionSort", "SelectionSort", "BubbleSort", "Finalizar"};
        int inputTamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("**********************************"
                + "\n*              ORDENAÇÃO               *"
                + "\n**********************************"
                + "\n\n Insira o tamanho do vetor:"));

        int[] array = new int[inputTamanhoVetor];
        int valor, g = -1, f = -1;

        for (int i = 0; i < inputTamanhoVetor; i++) {

            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));

            array[i] = valor;

        }

        

        while (f != 1) {
            
            JOptionPane.showOptionDialog(null, "Selecione o método de ordenação", " ", 0, 0, null, opcoes, " ");
            
            switch (g) {
                case 0:
                    insertion(array);
                    mostraInsertion(array);
                    break;
                case 1:
                    selection(array);
                    mostraSelection(array);
                    break;
                case 2:
                    bubble(array);
                    mostraBubble(array);
                    break;
                default:
                    g = 3;
                    break;
                }
            f = 1;
        }

    }

    public static void insertion(int[] array) {
        long inicio = System.nanoTime();
        int chave, j;

        for (int i = 0; i < array.length; i++) {

            chave = array[i];

            for (j = i - 1; j >= 0 && array[j] > chave; j--) {

                array[j + 1] = array[j];

            }

            array[j + 1] = chave;
        }
        long fim = System.nanoTime();
        long tempoExecutado = fim - inicio;
        JOptionPane.showMessageDialog(null, tempoExecutado + " Nano Segundosiiiiii");
    }

    public static void selection(int[] vetor) {
        long inicio = System.nanoTime();
        for (int i = 0; i < vetor.length - 1; i++) {

            int posMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {

                if (vetor[j] < vetor[posMenor]) {

                    posMenor = j;

                }

            }

            if (posMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }
            long fim = System.nanoTime();
            long tempoExecutado = fim - inicio;
            JOptionPane.showMessageDialog(null, tempoExecutado + " Nano Segundossssss");
        }
    }

    public static void bubble(int[] vetor) {
        long inicio = System.nanoTime();
        boolean troca = true;

        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;

                }

            }
        }
        long fim = System.nanoTime();
        long tempoExecutado = fim - inicio;
        JOptionPane.showMessageDialog(null, tempoExecutado + " Nano Segundosbbbbbb");
    }

    public static void mostraInsertion(int[] vetor) {

        String msg = "Vetor = |";
        for (int i = 0; i < vetor.length; i++) {

            msg += vetor[i] + "|";

        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostraSelection(int[] vetor) {

        String msg = "Vetor = |";
        for (int i = 0; i < vetor.length; i++) {

            msg += vetor[i] + "|";

        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostraBubble(int[] vetor) {

        String msg = "Vetor = |";
        for (int i = 0; i < vetor.length; i++) {

            msg += vetor[i] + "|";

        }

        JOptionPane.showMessageDialog(null, msg);

    }
}
