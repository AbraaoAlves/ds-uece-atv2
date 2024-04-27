package com.atv1.app.lib;

public class No {
  public No proximo = null;
  private Integer atual;
  
  public No(){
    this.proximo = null;
    this.atual = null;
  }

  public int getAtual(){
    return (int) this.atual;
  }

  public int size(){
    int result = atual == null ? 0:1;
    No aux = this;
    while (aux.proximo != null) {
      aux = aux.proximo;
      result++;
    }
    return result;
  }

  public void set(int position, int value){
    No aux = this;
    for (int i = 0; i < position; i++) {      
      aux = aux.proximo;
    }
    aux.atual = value;
  }

  public void add(int value){
    No aux = this;
    while (aux.proximo != null) {
      aux = aux.proximo;
    }
    aux.proximo = new No();
    aux.proximo.atual = value;
  }

  public int get(int position){
    No aux = this;
    for (int i = 0; i < position; i++) {
      aux = aux.proximo;
    }
    return aux.atual;
  }

  public void remove(int position){
    No aux = this;
    for (int i = 0; i < position; i++) {
      aux = aux.proximo;
    }
    
    if (aux.proximo != null && aux.proximo.proximo != null) {
      aux.proximo = aux.proximo.proximo;
    } else if(aux.proximo != null){
      aux.proximo = null;
    }
  }
}
