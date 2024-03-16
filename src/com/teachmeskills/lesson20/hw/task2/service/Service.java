package com.teachmeskills.lesson20.hw.task2.service;

import com.teachmeskills.lesson20.hw.task2.consts.Constants;

public class Service {

    int countOfCars = 0;

    public synchronized void takeCar() {
        while (countOfCars >= Constants.SERVICE_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        countOfCars++;
        System.out.println("Taking one more car to the service. Cars in service: " + countOfCars);
        notify();
    }

    public synchronized void returnCar() {
        while (countOfCars < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        countOfCars--;
        System.out.println("Returning one car to the customer. Cars in service: " + countOfCars);
        notify();
    }
}
