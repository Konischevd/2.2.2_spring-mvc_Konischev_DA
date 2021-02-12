package web;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsBD {

    public static List<Car> getBD () {
        List<Car> list = new ArrayList<>();

        Car car1 = new Car("Mercedes", "C325", "Белый");
        Car car2 = new Car("BMW", "325d", "Black");
        Car car3 = new Car("Toyota", "rav-4", "Белый перламутр");
        Car car4 = new Car("Волга", "здоровая", "Дурацкий белый");
        Car car5 = new Car("Tesla", "CyberTruck", "Metallic");

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        return list;
    }

}
