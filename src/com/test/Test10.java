package com.test;

public final class Test10 implements Cloneable {
  
  private static Object lock = new Object();
  
  private static Test10  test10;
  
   private Test10() throws Exception {
     if(test10 != null) {
       throw new Exception();
     }
   }
   
   private static Test10 getInstance() throws Exception {
     synchronized (lock) {
       
       if(test10 == null) {
         synchronized (lock) {
           test10  = new Test10();
          }
       }
     }
    return test10;
   }
   
   @Override
  protected Object clone() throws CloneNotSupportedException {
     if(test10 == null) {
      try {
        return getInstance();
      } catch (Exception e) {
        e.printStackTrace();
      }
     }
    return test10;
  }

}
