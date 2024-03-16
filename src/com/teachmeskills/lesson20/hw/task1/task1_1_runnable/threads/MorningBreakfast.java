package com.teachmeskills.lesson20.hw.task1.task1_1_runnable.threads;

public class MorningBreakfast implements Runnable {

    Thread thread;

    public MorningBreakfast(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        eatingBreakfast();
    }

    private void eatingBreakfast() {
        System.out.println("Eating breakfast");
    }
}
