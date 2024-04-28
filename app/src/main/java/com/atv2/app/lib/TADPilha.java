package com.atv2.app.lib;

public interface TADPilha<T> {
    
  // Adds an element to the end of the stack.
  void push(T num); 
  // Removes the topmost element from the stack.
  T pop(); 
  // Retrieves the topmost element without removing it.
  T peek();

  // Checks if the stack is empty.
  boolean isEmpty();
  
  // Checks if the stack is full.
  boolean isFull();
}
