package com.atv1.app;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

public class PilhaTests {
  

  @Test
  void Pilha_should_be_a_TADPilha() {
    Pilha pilha = new Pilha(0);
    assertInstanceOf(TADPilha.class, pilha);
  } 
}
