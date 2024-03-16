package com.teachmeskills.lesson20.hw.task1.task1_1_runnable.threads;

public class MorningNews implements Runnable {

    Thread thread;

    public MorningNews(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        readingNews();
    }

    private void readingNews() {
        System.out.println("Reading news");
    }
}
