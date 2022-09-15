import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//for 문 연습
public class p122ex4 {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            for (int b = 1; b < a + 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}