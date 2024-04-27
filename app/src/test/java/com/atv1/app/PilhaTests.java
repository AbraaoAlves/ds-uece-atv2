package com.atv1.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import com.atv1.app.lib.*;

public class PilhaTests {
  

  @Test
  void Pilha_should_be_a_TADPilha() {
    Pilha pilha = new Pilha(0);
    assertInstanceOf(TADPilha.class, pilha);
  } 
  
  @Test
  void push_should_item_in_first_position_in_Pilha(){
    Pilha pilha = new Pilha(10);
    pilha.push(1);
    pilha.push(2);

    assertEquals(2, pilha.peek());

    pilha.push(3);
    pilha.push(4);

    assertEquals(4, pilha.peek());
  }

  @Test
  void total_should_return_quantity_of_itens_in_Pilha(){
    Pilha pilha = new Pilha(10);

    pilha.push(1);
    pilha.push(2);
    assertEquals(2, pilha.total());

    pilha.push(1);
    pilha.push(2);
    assertEquals(4, pilha.total());

    pilha.push(1);
    pilha.pop();
    assertEquals(4, pilha.total());
  }

  @Test
  void pop_should_remove_first_item_from_Pilha_and_return_removed_item(){
    Pilha pilha = new Pilha(10);

    pilha.push(1);
    pilha.push(2);
    pilha.push(5);
    assertEquals(3, pilha.total());

    pilha.push(2);

    assertEquals(2, pilha.pop());
    assertEquals(5, pilha.peek());
  }

}
