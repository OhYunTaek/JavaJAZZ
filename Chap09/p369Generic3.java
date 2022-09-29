/*
 * Code By OhYunTaek 2022.09.28(수)
 */
public class p369Generic3 {
    public static void main(String[] args) {
        p368Cup c = new p368Cup();

        c.setBeverage(new p364Beer());
        // p364Beer b1 = c.getBeverage();
        p364Beer beer = (p364Beer) c.getBeverage();

        // b1 = c.getBeverage();
    }
}