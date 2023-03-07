package br.pc.oo.algaworks.desafio6_3;

import java.util.*;

public class Jogo {

    /**
     * retorna um número aleatório de inteiro até 60
     * @return
     */
    public int numeroAleatorios(){
        return numerosAleatorios(60);
    }


    /**
     * retorna um número aleatório de inteiro até a quantidade passada como parâmetro;
     * @param numero
     * @return
     */
    public int numerosAleatorios(int numero){
        double valor = Math.random();
        return  (int) (valor * numero) + 1;
    }


    /**
     * Gera a quantidade de números passado como parâmetro de 1 à 60
     * @param quantidade
     * @return
     */
    public Set<Integer> geradorNumeros(int quantidade){
        Set<Integer> numeros = new LinkedHashSet<>();
        while(numeros.size() < quantidade) {
            int v = numeroAleatorios();
            numeros.add(v);
//            System.out.print(v);
//            System.out.print(" - ");
        }
        return numeros;
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        int j = 0;
        for (int i = 0; i < 9; i++){
            System.out.println("JOGO "+(i+1)+" \t");
            jogo.geradorNumeros(6).stream()
                    .sorted()
                    .forEach(n -> {
                        System.out.print(n + " - ");
                    });
            System.out.println();
        }
    }


}
