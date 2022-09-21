import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p201ex2 {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);
        System.out.print("학생의 수 입력 : ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + " 명의 학생 성적을 입력");
        for (int i = 0; i < numOfStudents; i++)
            scores[i] = in.nextInt();

        System.out.println(numOfStudents + " 입력한 학생들의 성적은 다음과 같다");
        for (int i = 0; i < numOfStudents; i++)
            System.out.print(scores[i] + " ");
        System.out.println();

        for (int i = 0; i < numOfStudents; i++) {
            if (scores[i] >= 90)
                System.out.println((i + 1) + " 번 학생의 학점은 A");
            else if (scores[i] >= 75 && scores[i] < 90)
                System.out.println((i + 1) + " 번 학생의 학점은 B");
            else if (scores[i] >= 60 && scores[i] < 75)
                System.out.println((i + 1) + " 번 학생의 학점은 C");
            else
                System.out.println((i + 1) + " 번 학생 다음 학기에 또 봐요");
        }
    }
}