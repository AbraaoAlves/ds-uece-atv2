package com.atv2.app.lib;

public class Fila<T> implements TADFila<T> {
  No<T> no;
  int size;

  public Fila(int n) {
    size = n;
    no = null;
  }

  public void enqueue(T i) {
    if (no == null) {
      no = new No<T>();
      no.set(0, i);
    } else {
      no.add(i);
    }
  }

  public T dequeue() {
    if (isEmpty()) {
      System.err.println("Fila vazia");
      return null;
    }

    T result = no.getAtual();
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

  @Override
  public String toString() {
    if (no == null) {
      return "";
    }

    String Ans = "";
    int total = total();
    for (int i = 0; i < total-1; i++) {
      Ans += String.valueOf(no.get(i)) + "->";
    }
    Ans += String.valueOf(no.get(total-1));
    return Ans;
  }
}
