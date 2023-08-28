package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceImpl implements Service {
    public static List<Car> listCar;

    static {
        listCar = new ArrayList<>();

        listCar.add(new Car(1, "Mercedes", "White"));
        listCar.add(new Car(2, "BMW", "Green"));
        listCar.add(new Car(3, "Audi", "Blue"));
        listCar.add(new Car(4, "Lexus", "Yellow"));
        listCar.add(new Car(5, "Porsche", "Black"));

    }
    @Override
    public List<Car> selectCar(int count) {
        if (count == 0 || count > 5) return listCar;
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}