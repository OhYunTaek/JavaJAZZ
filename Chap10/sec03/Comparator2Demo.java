package sec03;

import java.util.*;
import sec02.*;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class Comparator2Demo {
    public static void main(String[] args) {
        List<Car> list = Car.cars.subList(0, 3);
        Car[] cars = list.toArray(new Car[4]);

        Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);

        System.out.println(Arrays.toString(cars));
        Comparator<Car> modelComparatorNullsFirst = Comparator.nullsFirst(modelComparator);

        Arrays.sort(cars, modelComparatorNullsFirst);
        System.out.println(Arrays.toString(cars));

        list.set(2, new Car("코란도", false, 10, 220000));

        // 이부분 오류 있음. all을 list로 변경하니 해결됨
        // cars = all.toArray(new Car[3]);
        cars = list.toArray(new Car[3]);

        System.out.println(Arrays.toString(cars));
        Comparator<Car> modelNAgeComparator = modelComparator.thenComparing(Car::getAge);

        Arrays.sort(cars, modelNAgeComparator);
        System.out.println(Arrays.toString(cars));
    }
}