/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p96While {
    public static void main(String[] args) {
        int i = 2;
        do {
            int y = 1;
            do {
                System.out.printf("%4d", i * y);
                y++;
            } while (y < 10);
            System.out.println();
            i++;
        } while (i < 10);
    }
}