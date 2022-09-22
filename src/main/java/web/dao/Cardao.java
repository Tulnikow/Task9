package web.dao;

import web.model.Car;

import java.util.List;

public interface Cardao {
    List<Car> getCar(int count);
}
