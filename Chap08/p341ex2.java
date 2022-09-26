import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p341ex2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("제네시스");
        Car2 yourCar = new Car2("제네시스");
        if (!myCar.equals(yourCar))
            System.out.println("내 자동차는 [" + myCar.name + "], 당신 자동차는 [" + yourCar.name + "] 로 모델이 다르다");
        else
            System.out.println("자동차 모델이 둘 다 [" + myCar.carName + "] 로 똑같다");

        Date d = new Date();

        SimpleDateFormat date1 = new SimpleDateFormat("날짜: MM-dd-yyyy");

        System.out.print(date1.format(d));
        String s = MessageFormat.format(", 자동차 모델 = [{0}], 운전자({1})", myCar.carName, myCar.name);
        System.out.println(s);
    }
}

class Car2 {
    String carName;
    String name = "오윤택";

    public Car2(String name) {
        this.carName = name;
    }

    public boolean equals(Car2 a) {
        return this.carName.equals(a.carName);
    }
}