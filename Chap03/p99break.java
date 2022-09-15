/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p99break {
    public static void main(String[] args) {
        int i = 1, j = 5;

        while (true) {
            System.out.println(i++);
            if (i >= j)
                break;
        }
    }
}