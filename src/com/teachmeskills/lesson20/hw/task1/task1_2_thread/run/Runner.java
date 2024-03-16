package com.teachmeskills.lesson20.hw.task1.task1_2_thread.run;

import com.teachmeskills.lesson20.hw.task1.task1_2_thread.threads.MorningBreakfast;
import com.teachmeskills.lesson20.hw.task1.task1_2_thread.threads.MorningCoffee;
import com.teachmeskills.lesson20.hw.task1.task1_2_thread.threads.MorningNews;

public class Runner {

    public static void main(String[] args) {
        MorningBreakfast morningBreakfast = new MorningBreakfast("breakfast");
        morningBreakfast.setPriority(5);
        morningBreakfast.start();
        MorningCoffee morningCoffee = new MorningCoffee("coffee");
        morningCoffee.setPriority(1);
        morningCoffee.start();
        MorningNews morningNews = new MorningNews("news");
        morningNews.setPriority(3);
        morningNews.start();
    }
}
