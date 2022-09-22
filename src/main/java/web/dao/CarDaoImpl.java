package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements Cardao {
    private static List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, "Black"));
        cars.add(new Car("Audi", 123, "White"));
        cars.add(new Car("Toyota", 6, "Red"));
        cars.add(new Car("VAZ", 3, "Blue"));
        cars.add(new Car("Nisan", 234, "Yellow"));
    }

    @Override
    public List<Car> getCar(int count) {
        count = count > 5 ? 5 : count;
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            carList.add(car);
        }
        return carList.subList(0, count);
    }
}
