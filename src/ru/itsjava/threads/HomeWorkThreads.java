package ru.itsjava.threads;

public class HomeWorkThreads {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Printer printer = new Printer("Любое сообщение1", 300);
                printer.run();
            }
        };
        Thread Thread1 = new Thread(runnable);
        Thread1.start();

        Printer printer = new Printer("Любое сообщение2", 500);
        Thread Thread2 = new Thread(printer);
        Thread2.start();
    }
}
