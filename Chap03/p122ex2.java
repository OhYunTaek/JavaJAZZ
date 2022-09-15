import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//switch 문 연습
public class p122ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("몇 등 인지 입력하라 : ");
        int rank = in.nextInt();

        switch (rank) {
            case 1:
                System.out.println("아주 잘했다");
                break;
            case 2, 3:
                System.out.println("잘했다");
                break;
            case 4, 5, 6:
                System.out.println("그저 그렇네");
                break;
            default:
                System.out.println("노력좀 해라");
        }
    }
}