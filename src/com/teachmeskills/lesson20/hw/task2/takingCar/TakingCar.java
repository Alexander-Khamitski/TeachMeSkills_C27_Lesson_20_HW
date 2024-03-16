package com.teachmeskills.lesson20.hw.task2.takingCar;

import com.teachmeskills.lesson20.hw.task2.consts.Constants;
import com.teachmeskills.lesson20.hw.task2.service.Service;

public class TakingCar implements Runnable {

    private Service service;

    public TakingCar(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        takeCarToService();
    }

    private void takeCarToService() {
        for (int i = 0; i < Constants.SERVICE_CAPACITY; i++) {
            service.takeCar();
        }
    }
}
