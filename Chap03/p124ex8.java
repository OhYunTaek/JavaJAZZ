import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//switch 문 연습
public class p124ex8 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        return switch (n) {
            case 1 -> 1;
            default -> n * factorial(n - 1);
        };
    }
}