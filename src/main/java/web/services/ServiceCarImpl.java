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
    public List<Car> getCarByCount(int count) {
        List<Car> listcar = dao.getCar();
        count = (count >= 5 || count < 0 || count > listcar.size()) ? listcar.size() : count;
        return listcar.subList(0, count);
    }
}

