package web.service;

import web.dao.CarDAO;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO car;

    public CarServiceImpl(CarDAO car) {
        this.car = car;
    }

    @Override
    public List<Car> showSomeCars(int count) {
        return car.showSomeCars(count);

    }
}