package com.atv2.app;

import com.atv2.app.lib.Fila;
import com.atv2.app.lib.Pilha;

/**
 *  Considere uma pilha P vazia e uma fila F não vazia. Utilizando apenas as funções desses
 TADs, elabore um algoritmo que inverta a ordem dos elementos na fila F.
 */
public class Question4 {
  public static void main(String[] args) {
    Pilha<Integer> pilha = new Pilha<Integer>(10);
    Fila fila = new Fila(10);
    
    for (int i = 0; i < 10; i++) {
      fila.enqueue(i);
    }
    
    System.out.println("Pilha: " + pilha.toString());
    System.out.println("Fila: " + fila.toString());
    System.out.println("Invertendo a fila na pilha...");

    while (!fila.isEmpty()) {
      pilha.push(fila.dequeue());
    }

    System.out.println("Pilha: " + pilha.toString());
    System.out.println("Fila: " + fila.toString());
  }
} 
