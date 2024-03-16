package com.teachmeskills.lesson20.hw.task1.task1_1_runnable.threads;

public class MorningCoffee implements Runnable {

    Thread thread;

    public MorningCoffee(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        drinkCoffee();
    }

    private void drinkCoffee() {
        System.out.println("Drinking coffee");
    }
}
