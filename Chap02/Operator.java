/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */
public class Operator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.printf("%d\t%d\t%d\n", x, y, z);

        int year = 2020;
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}