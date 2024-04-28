package com.atv2.app;

import com.atv2.app.lib.Fila;
import com.atv2.app.lib.TADFila;

/**
 * 
 * Utilizando apenas o TAD Fila, proponha um algoritmo para o Problema de Josephus. 
 * Este pode ser visto como um processo de eleição de um líder em que n pessoas 
 * (identificadas por números de 1 a n, em ordem) elegem um líder colocando-se em círculo 
 * e contando sempre até um dado número m. 
 * 
 * A pessoa que estiver na posição m é eliminada do círculo e a contagem 
 * recomeça no indivíduo seguinte. O processo termina quando 
 * restar apenas uma única pessoa, e esta será o líder.
 * 
 */
public class Question2 {
  public static void main(String[] args) {
    int n = 100;
    int m = 13;
    TADFila fila = new Fila(n);

    for (int i = 1; i <= n; i++) {
      fila.enqueue(i);
    }

    while (fila.total() > 1) {
      for (int i = 0; i < m - 1; i++) {
        // move itens para o final da fila
        fila.enqueue(fila.dequeue());
      }
      fila.dequeue();
    }

    System.out.println("O lider é: " + fila.dequeue());
  }
}
