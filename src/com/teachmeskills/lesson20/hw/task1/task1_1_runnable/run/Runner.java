package com.teachmeskills.lesson20.hw.task1.task1_1_runnable.run;

import com.teachmeskills.lesson20.hw.task1.task1_1_runnable.threads.MorningBreakfast;
import com.teachmeskills.lesson20.hw.task1.task1_1_runnable.threads.MorningCoffee;
import com.teachmeskills.lesson20.hw.task1.task1_1_runnable.threads.MorningNews;

public class Runner {

    public static void main(String[] args) {
        MorningBreakfast morningBreakfast = new MorningBreakfast("breakfast");
        MorningCoffee morningCoffee = new MorningCoffee("coffee");
        MorningNews morningNews = new MorningNews("news");
    }
}
