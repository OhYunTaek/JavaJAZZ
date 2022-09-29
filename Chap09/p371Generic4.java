import java.util.ArrayList;

/*
 * Code By OhYunTaek 2022.09.28(수)
 */
public class p371Generic4 {
    public static void main(String[] args) {
        ArrayList<p364Beverage> list1 = new ArrayList<>();
        list1.add(new p364Beer());
        beverageTest(list1);

        ArrayList<p364Beer> list2 = new ArrayList<>();
        list2.add(new p364Beer());
    }

    static public void beverageTest(ArrayList<p364Beverage> list) {
    }
}