package com.teachmeskills.lesson20.hw.task2.run;

import com.teachmeskills.lesson20.hw.task2.returningCar.ReturningCar;
import com.teachmeskills.lesson20.hw.task2.service.Service;
import com.teachmeskills.lesson20.hw.task2.takingCar.TakingCar;

public class Runner {

    public static void main(String[] args) {
        Service service = new Service();
        TakingCar takingCar = new TakingCar(service);
        ReturningCar returningCar = new ReturningCar(service);
        Thread t2 = new Thread(returningCar);
        t2.start();
        Thread t1 = new Thread(takingCar);
        t1.start();
    }
}
