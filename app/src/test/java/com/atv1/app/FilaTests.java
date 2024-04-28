package com.atv1.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.atv1.app.lib.Fila;

public class FilaTests {
  
  @Test
  void enqueue(){
      Fila fila = new Fila(10);

      fila.enqueue(1);
      fila.enqueue(2);

      assertEquals(2, fila.total());
  }

  @Test
  void dequeue(){
      Fila fila = new Fila(10);

      fila.enqueue(1);
      fila.enqueue(2);
      fila.enqueue(3);

      assertEquals(1, fila.dequeue());
      assertEquals(2, fila.dequeue());
      assertEquals(3, fila.dequeue());
  }

  @Test
  void total(){
      Fila fila = new Fila(10);

      fila.enqueue(1);
      fila.enqueue(2);
      fila.enqueue(3);

      assertEquals(3, fila.total());
  }

  @Test
  void isEmpty(){
      Fila fila = new Fila(10);

      assertEquals(true, fila.isEmpty());

      fila.enqueue(1);
      assertEquals(false, fila.isEmpty());

      fila.dequeue();
      assertEquals(true, fila.isEmpty());
  }

    @Test   
    void check_toString(){
        Fila fila = new Fila(10);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);

        assertEquals("1->2->3->4", fila.toString());

        fila.dequeue();
        fila.dequeue();

        assertEquals("3->4", fila.toString());
    }
}
