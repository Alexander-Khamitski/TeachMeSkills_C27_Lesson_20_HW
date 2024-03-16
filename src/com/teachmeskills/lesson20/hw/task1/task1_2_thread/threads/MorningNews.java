package com.teachmeskills.lesson20.hw.task1.task1_2_thread.threads;

public class MorningNews extends Thread {

    Thread thread;

    public MorningNews(String activity) {
        System.out.println("Thread: Morning " + activity);
        thread = new Thread(this);
    }

    @Override
    public void run() {
        readingNews();
    }

    private void readingNews() {
        System.out.println("Reading news");
    }
}
