package com.atv1.app;

public class Pilha implements TADPilha {

  private int size;
  private int top = -1;
  private No no;

  public Pilha(int size) {
    this.size = size;
    this.no = null;
  }

  public void push(int num) {
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

  public int pop() {
    int result = peek();
    no.remove(--top);

    return result;
  }
  /**
   * get first position item
   */
  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return -1;
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
      for (int i = 0; i < top; i++) {
          Ans += String.valueOf(no.get(i)) + "->";
      }
      Ans += String.valueOf(no.get(top));
      return Ans;
  }
}
