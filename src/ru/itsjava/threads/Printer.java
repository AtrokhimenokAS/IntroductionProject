package ru.itsjava.threads;

public class Printer implements Runnable {
    private  String message;
    private long millis;

    public Printer(String message, long mills) {
        this.message = message;
        this.millis = mills;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}
