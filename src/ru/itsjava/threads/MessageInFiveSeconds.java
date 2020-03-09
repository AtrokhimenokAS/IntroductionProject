package ru.itsjava.threads;

public class MessageInFiveSeconds {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            Thread.sleep(5000);
            System.out.println("Любое сообщение3");

        }
    }
}
