/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p386ex1 {
    public static void main(String[] args) {
        // MyDate d = null;
        MyDate d = new MyDate(2022, 9, 29);

        // try {
        System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
        // }
        // catch (NullPointerException e) {
        // System.out.println("null값을 가진참조 변수에 접근하고 있다");
        // } catch (Exception e) {
        // System.out.println("읔엑!!");
        // }
    }
}

class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}