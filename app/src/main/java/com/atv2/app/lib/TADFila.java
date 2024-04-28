package com.atv2.app.lib;

public interface TADFila<T> {

  void enqueue(T i);

  T dequeue();

  int total();

  // Checks if the stack is empty.
  boolean isEmpty();

  // Checks if the stack is full.
  boolean isFull();
}
