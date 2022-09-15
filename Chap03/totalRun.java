import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class totalRun {

    // p86 If 예제
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            System.out.print("숫자를 입력 : ");
            int number = in.nextInt();

            if (number % 2 == 0)
                System.out.println("짝수");
            if (number % 2 == 1)
                System.out.println("홀수");
            System.out.println("종료");
        }

        {
            Scanner in = new Scanner(System.in);
            String grade;
            System.out.print("점수를 입력 : ");
            int score = in.nextInt();

            if (score >= 90)
                grade = "A";

            else if (score >= 80)
                grade = "B";

            else if (score >= 70)
                grade = "C";

            else if (score >= 60)
                grade = "D";

            else
                grade = "F";

            System.out.println("너의 학점은 " + grade);
        }

        {
            int i = 1;
            while (i < 11) {
                System.out.println(i);
                i++;
            }
        }

        {
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

        {
            int i = 1;
            do {
                System.out.print(i);
                i++;
            } while (i < 5);
        }

        {
            int i = 10;
            do {
                i++;
            } while (i < 5);
            System.out.println("do~while 문 실행 후 : " + i);

            i = 10;
            while (i < 5) {
                i++;
            }
            System.out.println("while 문 실행 후 : " + i);
        }

        {
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
}