package com.teachmeskills.lesson20.hw.task1.task1_2_thread.threads;

public class MorningBreakfast extends Thread {

    private String threadName;

    public MorningBreakfast(String name) {
        System.out.println("Thread: Morning " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        eatingBreakfast();
    }

    private void eatingBreakfast() {
        System.out.println("Eating breakfast");
    }
}
