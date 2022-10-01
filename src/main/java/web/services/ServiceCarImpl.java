package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.dao.CarDaoImpl;


import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {
    @Autowired
    private CarDaoImpl dao;


    @Override
    public List<Car> getCar(int count) {
        count = (count > 5 || count < 0) ? 5 : count;
        return dao.getCar().subList(0, count);
    }
}

