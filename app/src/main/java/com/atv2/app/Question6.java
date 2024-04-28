package com.atv2.app;

import com.atv2.app.lib.Fila;
import com.atv2.app.lib.Pilha;

/**
 * 
 * No desenvolvimento de um software que analisa bases de DNA, representadas pelas
 letras A, C, G e T, utilizou-se as estruturas de dados: pilha e fila. Considere que, se uma
 sequência representa uma pilha, o topo é o elemento mais à esquerda; e se uma sequência
 representa uma fila, a sua frente é o elemento mais à esquerda. Analise o seguinte cenário:
 “A sequência inicial ficou armazenada na primeira estrutura de dados na seguinte ordem:
 AGTCAGTT. Cada elemento foi retirado da primeira estrutura de dados e inserido na
 segunda estrutura de dados, e a sequência ficou armazenada na seguinte ordem: TTGACTGA.
 Finalmente, cada elemento foi retirado da segunda estrutura de dados e inserido na terceira
 estrutura de dados e a sequência ficou armazenada na seguinte ordem: TTGACTGA”.
 Qual a única sequência de estruturas de dados apresentadas a seguir pode ter sido usada no
 cenário descrito acima?

 Resposta: Fila - Pilha - Fila
 */
public class Question6 {
  public static void main(String[] args) {
    System.out.println("Fila - Pilha - Fila");

    Fila<Character> l1 =  new Fila<Character>(8);
    Pilha<Character> l2 =  new Pilha<Character>(8);
    Fila<Character> l3 =  new Fila<Character>(8);

    char[] data = {'A', 'G', 'T', 'C', 'A', 'G', 'T', 'T'};

    for (char c : data) {
      l1.enqueue(c);
    }
    System.out.println("Fila  1: " + l1.toString());

    while (!l1.isEmpty()) {
      l2.push(l1.dequeue());
    }
    System.out.println("Pilha 2: " + l2.toString());

    while (!l2.isEmpty()) {
      l3.enqueue(l2.pop());
    }

    System.out.println("Fila  3: " + l3.toString());

  }
}
