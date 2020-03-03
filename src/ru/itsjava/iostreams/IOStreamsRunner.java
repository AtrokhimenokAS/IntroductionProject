package ru.itsjava.iostreams;

import ru.itsjava.lectures.oop.Dog;

import java.io.*;

public class IOStreamsRunner {
    public static void main(String[] args) {
     /*   BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
       try {
          String input = bufferedReader.readLine();
           System.out.println("Наша строка: "+input);
           bufferedReader.close();
       }catch (IOException e) {
           e.printStackTrace();
       }
       finally {
           try {
               bufferedReader.close();
           }catch (IOException e){e.printStackTrace();}
       }*/
      /*  try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            System.out.println("Наша строка: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }*/


     /*   try (BufferedReader tempBufferedReader = new BufferedReader((new InputStreamReader(System.in)))) {
            String input;
            while (!(input = tempBufferedReader.readLine()).equals("exit")) {
                System.out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

      /* try( PrintWriter writer = new PrintWriter(new File("file.txt"))) {
           writer.print("Привет, я PrintWriter");
       }
       catch (FileNotFoundException e) {
           e.printStackTrace();
       }*/
     /* try(BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
          System.out.println(bufferedReader.readLine());
      }catch (FileNotFoundException e) {
          e.printStackTrace();
      }catch (IOException e) {
          e.printStackTrace();
      }*/
//сериализация
   /*  try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("dog.out"))) {
         objectOutputStream.writeObject(new Dog("Жучка"));
     }catch (IOException e){
         e.printStackTrace();
     }*/
//десериализация

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("dog.out"))) {
            Dog dog = (Dog) inputStream.readObject();
            System.out.println("dog.getName() = " + dog.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
//HW: 1.Объект класса User (login, password)Поставить transient на password.
//
//2. Даны 2 файла. В каждом файле содержит текст.
// необходимо поменять местами.
//3. рассказать 3 способа создания объекта.
// 4 . Написать свою запоминалку текста. Пользователь вводит Имя файла и путь к нему.
// Затем вводим максимум 10 предложений и все сохраняются в файле по выбранному пути.