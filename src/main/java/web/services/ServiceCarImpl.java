package web.services;

import web.model.Car;
import web.dao.CarDaoImpl;

import java.util.List;

public class ServiceCarImpl implements ServiceCar {

    private static CarDaoImpl dao = new CarDaoImpl();

   @Override
    public List<Car> getCar(int count) {
        return dao.getCar(count);
    }
}
