import java.util.ArrayList;

/*
 * Code By OhYunTaek 2022.09.28(수)
 */
public class p373Bounded1 {
    public static void main(String[] args) {
        Cup<p364Beer> c1 = new Cup<>();
        Cup<p365Boricha> c2 = new Cup<>();
    }
}

class Cup<T extends p364Beverage> {
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}