package com.atv2.app;

import com.atv2.app.lib.*;

/**
 * 
 *  Considere a seguinte sequência de dados: 50 34 88 37 87 52 81 10 43 77 18 47.
 Realize a inserção dos elementos, um a um, na ordem em que aparecem, em uma pilha e em
 uma fila. Em seguida, mostre como os elementos ficaram organizados em cada uma dessas
 estruturas. Por fim, remova três elementos de cada estrutura, e mostre novamente os dados
 armazenados em cada uma das estruturas.

 */
public class Question3 {
  public static void main(String[] args) {
    TADFila fila = new Fila(12);
    TADPilha pilha = new Pilha(12);

    int[] data = {50, 34, 88, 37, 87, 52, 81, 10, 43, 77, 18, 47};    

    for (int i = 0; i < data.length; i++) {
      fila.enqueue(data[i]);
      pilha.push(data[i]);
    }

    System.out.println("Fila : " + fila.toString());
    System.out.println("Pilha: " + pilha.toString());

    for (int i = 0; i < 3; i++) {
      fila.dequeue();
      pilha.pop();
    }

    System.out.println("Fila : " + fila.toString());
    System.out.println("Pilha: " + pilha.toString());
  }
}
