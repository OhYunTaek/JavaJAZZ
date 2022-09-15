import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//if else 문 연습
public class p122ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력하라 : ");
        int age = in.nextInt();

        if (age >= 19)
            System.out.println("성년");
        else
            System.out.println("미성년");

    }
}