// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */
class Dice {
    private double d1;

    public int roll() {
        this.d1 = (Math.random() * 10 % 6) + 1;
        return (int) d1;
    }

}

public class p164ex8 {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}