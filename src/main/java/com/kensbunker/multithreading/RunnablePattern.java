package com.kensbunker.multithreading;

public class RunnablePattern {

  public static void main(String[] args) {
    //
    System.out.println("Now running on thread " + Thread.currentThread().getName());
    Runnable runnable =
        () -> {
          String name = Thread.currentThread().getName();
          System.out.println("I am runnining in thread " + name);
        };

    Thread t = new Thread(runnable);
    t.setName("My thread");
    t.start();
  }
}
