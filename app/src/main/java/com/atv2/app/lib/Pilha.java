package com.atv2.app.lib;

public class Pilha<T> implements TADPilha<T> {

  private int size;
  private int top = -1;
  private No<T> no;

  public Pilha(int size) {
    this.size = size;
    this.no = null;
  }

  public void push(T num) {
    if (isFull()) {
      System.out.println("Stack Overflow");
    } else {
      top++;
      if (no == null) {
        no = new No();
        no.set(top, num);
      } else {
        no.add(num);
      }
    }
  }

  public T pop() {
    T result = peek();
    no.remove(--top);

    return result;
  }
  /**
   * get first position item
   */
  public T peek() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return null;
    } else {
      return no.get(top);
    }
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return this.size == total();
  }

  public int total(){
    return no != null ? this.no.size() : 0;
  }

  @Override
  public String toString() {
    if (no == null){
      return "";
    }  

    String Ans = "";
    for (int i = top; i > 0; i--) {
        Ans += String.valueOf(no.get(i)) + "->";
    }
    Ans += String.valueOf(no.getAtual());
    return Ans;
  }
}
