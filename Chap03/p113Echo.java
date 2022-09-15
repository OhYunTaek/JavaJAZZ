/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

public class p113Echo {
    public static void main(String[] args) {
        echo("안녕!", 3);
    }

    public static void echo(String s, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }
}