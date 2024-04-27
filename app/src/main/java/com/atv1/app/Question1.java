package com.atv1.app;


/**
 * 
 *  Utilizando apenas o TAD Pilha, proponha um algoritmo que 
 *  armazene 10 valores inteiros, gerados aleatoriamente 
 *  no intervalo de 1 a 100, em uma pilha P. 
 * 
 * Em seguida, inverta a ordem dos elementos na pilha P.
 */
public class Question1 {
    public static void main(String[] args) {
      TADPilha P = new Pilha(10);
      
      for(int i=0; i< 10;i++){
        int val = (int) (Math.random()* 100)+1;
        P.push(val);
      }

      System.out.println("Pilha normal: " + P.toString());

      TADPilha Q = new Pilha(10);
      while(!P.isEmpty()){
        Q.push(P.pop());
      }
      
      System.out.println("Pilha invertida: " + Q.toString());
    }
}
