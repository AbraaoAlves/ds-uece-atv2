package com.atv2.app.lib;

public interface TADFila {

  void enqueue(int i);

  int dequeue();

  int total();

  // Checks if the stack is empty.
  boolean isEmpty();

  // Checks if the stack is full.
  boolean isFull();
}
