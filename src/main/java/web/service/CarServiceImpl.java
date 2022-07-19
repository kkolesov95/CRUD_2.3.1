package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl  {

    public static List<Car> addCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford Mustang", "2021", 3.2));
        list.add(new Car("Nissan Almera", "2001", 1.6));
        list.add(new Car("Ferrari", "2007", 6.0));
        list.add(new Car("Volkswagen", "1989", 1.8));
        list.add(new Car("VAZ", "1990", 2.4));
        return list;
    }

    public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
