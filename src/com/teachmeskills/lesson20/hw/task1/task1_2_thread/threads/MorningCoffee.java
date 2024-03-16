package com.teachmeskills.lesson20.hw.task1.task1_2_thread.threads;

public class MorningCoffee extends Thread {

    private String threadName;

    public MorningCoffee(String name) {
        System.out.println("Thread: Morning " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        drinkingCoffee();
    }

    private void drinkingCoffee() {
        System.out.println("Drinking coffee");
    }
}
