package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford Mustang", "2021", 3.2));
        list.add(new Car("Nissan Almera", "2001", 1.6));
        list.add(new Car("Ferrari", "2007", 6.0));
        list.add(new Car("Volkswagen", "1989", 1.8));
        list.add(new Car("VAZ", "1990", 2.4));
        list = CarServiceImpl.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "cars";
    }
}
