package com.atv1.app.lib;

public interface TADPilha {
    
  // Adds an element to the end of the stack.
  void push(int num); 
  // Removes the topmost element from the stack.
  int pop(); 
  // Retrieves the topmost element without removing it.
  int peek();

  // Checks if the stack is empty.
  boolean isEmpty();
  
  // Checks if the stack is full.
  boolean isFull();
}
