package com.atv1.app.lib;

public interface TADFila {

  void enqueue(int i);

  int dequeue();

  int total();

  // Checks if the stack is empty.
  boolean isEmpty();

  // Checks if the stack is full.
  boolean isFull();
}
