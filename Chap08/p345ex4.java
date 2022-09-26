import java.util.Random;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex4 {
    public static void main(String[] args) {
        System.out.println(new Dice4().roll4());
    }
}

class Dice4 {
    int roll4() {
        Random r4 = new Random();
        return r4.nextInt(6) + 1;
    }
}