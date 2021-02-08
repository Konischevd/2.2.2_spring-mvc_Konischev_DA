package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<Car> getSomeCars(List<Car> list, int count) {
        List<Car> res = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            res.add(list.get(i));
        }
        return res;
    }
}
