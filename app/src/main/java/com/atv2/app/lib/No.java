package com.atv2.app.lib;

public class No<T> {
  public No<T> proximo = null;
  private T atual;
  
  public No(){
    this.proximo = null;
    this.atual = null;
  }

  public T getAtual(){
    return this.atual;
  }

  public int size(){
    int result = atual == null ? 0:1;
    No<T> aux = this;
    while (aux.proximo != null) {
      aux = aux.proximo;
      result++;
    }
    return result;
  }

  public void set(int position, T value){
    No<T> aux = this;
    for (int i = 0; i < position; i++) {      
      aux = aux.proximo;
    }
    aux.atual = value;
  }

  public void add(T value){
    No<T> aux = this;
    while (aux.proximo != null) {
      aux = aux.proximo;
    }
    aux.proximo = new No<T>();
    aux.proximo.atual = value;
  }

  public T get(int position){
    No<T> aux = this;
    for (int i = 0; i < position; i++) {
      aux = aux.proximo;
    }
    return aux.atual;
  }

  public void remove(int position){
    No<T> aux = this;
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
