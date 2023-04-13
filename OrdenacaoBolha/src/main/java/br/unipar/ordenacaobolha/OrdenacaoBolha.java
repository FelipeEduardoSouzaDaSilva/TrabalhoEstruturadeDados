/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ordenacaobolha;

import java.util.Random;

/**
 *
 * @author 00239689
 */
public class OrdenacaoBolha {

    public static void main(String[] args) {
        
        Random alt = new Random();
        int[]vetor = new int[100];
        boolean troca = true;
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = alt.nextInt();
        }
        
        while(troca){
            troca = false;
            for (int i = 0; i < vetor.length -1; i++) {
                if(vetor[i]>vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                    
                }
                
            }
        }
        
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"] = "+vetor[i]);
            
        }
        
        System.out.println("Tempo de Execução " + tempoExecucao);
        
    }
}
