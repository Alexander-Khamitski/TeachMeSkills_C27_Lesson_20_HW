package com.teachmeskills.lesson20.hw.task2.returningCar;

import com.teachmeskills.lesson20.hw.task2.consts.Constants;
import com.teachmeskills.lesson20.hw.task2.service.Service;

public class ReturningCar implements Runnable {

    private Service service;

    public ReturningCar(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        returnCarToCustomer();
    }

    private void returnCarToCustomer() {
        for(int i = 0; i < Constants.SERVICE_CAPACITY; i++){
            service.returnCar();
        }
    }
}
