package ru.itsjava.lectures.oop.exceptions;

public class ExceptionRunner {
    public static void main(String[] args) {
   //    throw new ExceptionInInitializerError();


       Man alexander = new Man ("Alexander",10);
      try{
          alexander.setAge(5);
      } catch (MyBeautifulExeption ex) {
          System.err.println("Bad Age");
          ex.printStackTrace();
      } finally {
          System.out.println("Finally");
      }
      Woman irina = new Woman("Irina",27,55);
      try{
          irina.setWeight(70);
      } catch (MyException ex1){
          System.err.println("Не прилично спрашивать вес девушки");
          ex1.printStackTrace();
      } finally {
          System.out.println("Все сломалось нафиг");
      }
    }
}
