import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */
public class p75ex01 {
    public static void main(String[] args) {
        double w, h, area;
        Scanner in = new Scanner(System.in);
        System.out.print("직사각형의 가로 길이를 입력 : ");
        w = in.nextDouble();
        System.out.print("직사각형의 세로 길이를 입력 : ");
        h = in.nextDouble();
        System.out.printf("넓이는 " + w * h + "입니다");
        area = in.nextDouble();
    }
}