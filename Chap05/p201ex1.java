import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p201ex1 {
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

    }
}