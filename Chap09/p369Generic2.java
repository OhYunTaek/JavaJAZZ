/*
 * Code By OhYunTaek 2022.09.28(수)
 */
public class p369Generic2 {
    public static void main(String[] args) {
        p368Cup<p364Beer> c = new p368Cup<p364Beer>();

        c.setBeverage(new p364Beer());
        p364Beer b1 = c.getBeverage();

        b1 = c.getBeverage();
    }
}