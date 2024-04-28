package com.atv1.app.lib;

public class Fila implements TADFila {
  No no;
  int size;

  public Fila(int n) {
    size = n;
    no = null;
  }

  public void enqueue(int i) {
    if (no == null) {
      no = new No();
      no.set(0, i);
    } else {
      no.add(i);
    }
  }

  public int dequeue() {
    if (isEmpty()) {
      System.err.println("Fila vazia");
      return -1;
    }
    
    int result = no.getAtual();
    no = no.proximo;
    return result;
  }
  
  public int total() {
    return no != null ? no.size() : 0;
  }

  public boolean isEmpty() {
    return no == null;
  }

  public boolean isFull() {
    return size == total();
  }

}
