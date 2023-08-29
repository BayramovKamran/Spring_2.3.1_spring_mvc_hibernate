package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    public List<Car> showSomeCars(int count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Mercedes", "White"));
        cars.add(new Car(2, "BMW", "Green"));
        cars.add(new Car(3, "Audi", "Blue"));
        cars.add(new Car(4, "Lexus", "Yellow"));
        cars.add(new Car(5, "Porsche", "Black"));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}



