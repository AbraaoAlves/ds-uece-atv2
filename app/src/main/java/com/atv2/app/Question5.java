package com.atv2.app;

import com.atv2.app.lib.Pilha;

/**
 * 
 * Proponha um algoritmo que leia uma cadeia contendo apenas os
 * caracteres {, }, [, ], (, ) e, utilizando uma pilha, verifique o
 * balanceamento dos mesmos.
 * 
 * Por exemplo, [{(})] não está balanceada; mas [()] está balanceada.
 */
public class Question5 {
  public static void main(String[] args) {

    String str = "{[()]}";
    boolean isBaleanced = checkBalance(str);

    if (isBaleanced) {
      System.out.println("Está balanceada");
    } else {
      System.out.println("Não está balanceada");
    }
  }

  public static boolean checkBalance(String str) {
  
    Pilha<Character> stack = new Pilha<Character>(str.length());

    for (int i = 0; i < str.length()/2; i++) {
      char c = str.charAt(i);
      stack.push(c);
    }

    for (int i = str.length()/2; i < str.length(); i++) {
      char c = str.charAt(i);
      char top = stack.pop();
      
      if ((c == '(' && top != ')') ||
        (c == ')' && top != '(') ||
        (c == '[' && top != ']') ||
        (c == ']' && top != '[') ||
        (c == '{' && top != '}') ||
        (c == '}' && top != '{')) {
        return false;
      }
    }

    return stack.isEmpty();

  }
}
