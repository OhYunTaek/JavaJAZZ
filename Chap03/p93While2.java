/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p93While2 {
    public static void main(String[] args) {
        int i = 2;
        while (i < 20) {
            int y = 1;
            while (y < 20) {
                System.out.printf("%4dX%1d=%1d", i, y, i * y);
                y++;
            }
            System.out.println();
            i++;
        }
    }
}