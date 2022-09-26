import java.text.DecimalFormat;

/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p339Decimal {
    public static void main(String[] args) {
        DecimalFormat f1 = new DecimalFormat("#");
        DecimalFormat f2 = new DecimalFormat("00000000.00");
        DecimalFormat f3 = new DecimalFormat("#.000");
        DecimalFormat f4 = new DecimalFormat("#,###.##");
        DecimalFormat f5 = new DecimalFormat("-#.#");
        DecimalFormat f6 = new DecimalFormat("#.##E00");
        DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
        DecimalFormat f8 = new DecimalFormat("#.00%");

        System.out.println(f1.format(1234567.890));
        System.out.println(f2.format(1234567.890));
        System.out.println(f3.format(1234567.890));
        System.out.println(f4.format(1234567.890));
        System.out.println(f5.format(1234567.890));
        System.out.println(f6.format(1234567.890));
        System.out.println(f7.format(-1234567.890));
        System.out.println(f8.format(1234567.890));
    }
}