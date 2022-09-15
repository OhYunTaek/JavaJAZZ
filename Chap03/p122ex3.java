import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//do~while 문 연습
public class p122ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("양의 정수 입력하라 : ");
            int number = in.nextInt();
            if (number % 2 == 0)
                num = num + number;
            else if (number <= 0)
                break;
        } while (true);
        System.out.printf("짝수의 합은" + num);
    }
}