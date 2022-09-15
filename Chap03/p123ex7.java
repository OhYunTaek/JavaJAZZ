import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//가위바위보 게임
public class p123ex7 {
    public static void main(String[] args) {
        String hong = input("홍인표");
        String kim = input("김용선");
        whosWin(hong, kim);
    }

    public static String input(String a) {
        String pick;
        Scanner in = new Scanner(System.in);
        System.out.printf("%s:", a);
        pick = in.next();
        return pick;
    }

    public static void whosWin(String hong, String kim) {
        if (hong.equals("가위") && kim.equals("가위") ||
                hong.equals("바위") && kim.equals("바위") ||
                hong.equals("보") && kim.equals("보"))

            System.out.println("비겼다.");

        else if (kim.equals("가위") && hong.equals("보") ||
                kim.equals("바위") && hong.equals("가위") ||
                kim.equals("보") && hong.equals("바위"))

            System.out.println("용선이 이겼습니다.");

        else {
            System.out.println("인표가 이겼습니다.");
        }
    }
}