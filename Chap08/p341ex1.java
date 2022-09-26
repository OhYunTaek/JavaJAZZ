/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p341ex1 {
    public static void main(String[] args) {
        Car1 myCar = new Car1("제네시스");
        Car1 yourCar = new Car1("그랜저");
        if (!myCar.equals(yourCar))
            System.out.println("내 자동차는 [" + myCar.name + "], 당신 자동차는 [" + yourCar.name + "] 로 모델이 다르다");
        else
            System.out.println("내 자동차는 [" + myCar.name + "], 당신 자동차는 [" + yourCar.name + "] 로 모델이 같다");
    }
}

class Car1 {
    String name;

    public Car1(String name) {
        this.name = name;
    }
}