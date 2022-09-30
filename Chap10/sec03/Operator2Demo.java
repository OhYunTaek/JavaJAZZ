package sec03;

import java.util.*;
import java.util.function.*;
import sec02.*;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class Operator2Demo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a - b;

        BinaryOperator<Integer> o1 = BinaryOperator.maxBy(comparator);
        System.out.println(o1.apply(10, 5));
        System.out.println(o1.apply(20, 25));

        BinaryOperator<Integer> o2 = BinaryOperator.minBy(comparator);
        System.out.println(o2.apply(10, 5));
        System.out.println(o2.apply(20, 25));

        List<Car> newCars = remodeling(Car.cars, c -> new Car("뉴" +
                c.getModel(), c.isGasoline(), c.getAge(), c.getMileage()));
        System.out.println(newCars);
    }

    static public List<Car> remodeling(List<Car> cars,
            UnaryOperator<Car> o) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : Car.cars)
            result.add(o.apply(car));
        return result;
    }
}