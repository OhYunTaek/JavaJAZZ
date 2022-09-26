import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p341ex3 {
    public static void main(String[] args) {
        Car3 myCar = new Car3("제네시스");
        Car3 yourCar = new Car3("제네시스");
        if (!myCar.equals(yourCar))
            System.out.println("내 자동차는 [" + myCar.name + "], 당신 자동차는 [" + yourCar.name + "] 로 모델이 다르다");
        else
            System.out.println("자동차 모델이 둘 다 [" + myCar.carName + "] 로 똑같다");

        Date d = new Date();

        SimpleDateFormat date1 = new SimpleDateFormat("MM-dd-yyyy");

        String s = MessageFormat.format("날짜: {0}, 자동차 모델 = [{1}], 운전자({2})", date1.format(d), myCar.carName,
                myCar.name);
        System.out.println(s);

        StringTokenizer st = new StringTokenizer(s, ", =[]()");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}

class Car3 {
    String carName;
    String name = "오윤택";

    public Car3(String name) {
        this.carName = name;
    }

    public boolean equals(Car3 a) {
        return this.carName.equals(a.carName);
    }
}