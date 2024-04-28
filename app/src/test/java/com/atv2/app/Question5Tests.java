package com.atv2.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Question5Tests {
  @Test
  void check_balanced(){
    assertTrue(Question5.checkBalance("[()]"));
    assertTrue(Question5.checkBalance("[{}]"));
    assertTrue(Question5.checkBalance("[]"));
    assertTrue(Question5.checkBalance("()"));
    assertTrue(Question5.checkBalance("([])"));
    
    assertTrue(Question5.checkBalance(")("));
    assertTrue(Question5.checkBalance("]["));
    assertTrue(Question5.checkBalance("}{"));

    assertFalse(Question5.checkBalance("[{(})]"));
    assertFalse(Question5.checkBalance("([)]"));
    assertFalse(Question5.checkBalance("()[]"));
  }
}
