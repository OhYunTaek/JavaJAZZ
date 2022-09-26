/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex5 {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
        // show(new Date());
    }

    static void show(CharSequence ex5) {
        System.out.println(ex5);
    }
}