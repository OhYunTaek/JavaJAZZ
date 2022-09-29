/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p365Generic1 {
    public static void main(String[] args) {
        p365Cup c = new p365Cup();

        c.setBeverage(new p364Beer());
        p364Beer b1 = (p364Beer) c.getBeverage();
        c.setBeverage(new p365Boricha());
        b1 = (p364Beer) c.getBeverage();
    }
}