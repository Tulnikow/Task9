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
        List<Car> listcar = dao.getCar();
        count = (count > listcar.size() || count < 0) ? listcar.size() : count;
        return listcar.subList(0, count);
    }
}

