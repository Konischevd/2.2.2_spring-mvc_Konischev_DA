package web.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarsTable(@RequestParam("count") int count , ModelMap model) {

        Car car1 = new Car("Mercedes", "C325", "Белый");
        Car car2 = new Car("BMW", "325d", "Black");
        Car car3 = new Car("Toyota", "rav-4", "Белый перламутр");
        Car car4 = new Car("Волга", "здоровая", "Дурацкий белый");
        Car car5 = new Car("Tesla", "CyberTruck", "Metallic");

        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        CarService service = new CarService();
        List<Car> newList = service.getSomeCars(list, count);

        model.addAttribute("cars", newList);

        return "cars";
    }



}
