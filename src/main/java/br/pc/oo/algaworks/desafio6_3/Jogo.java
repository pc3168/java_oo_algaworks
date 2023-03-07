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
        }
        return numeros;
    }


}
