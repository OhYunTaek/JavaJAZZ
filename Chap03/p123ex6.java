import java.util.Scanner;

/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//가위바위보 게임
public class p123ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("무엇을 낼까 ?");
        System.out.print("홍인표 : ");
        String hong = in.next();
        System.out.print("김용선 : ");
        String kim = in.next();

        if (hong.equals("가위") && kim.equals("보") ||
                hong.equals("바위") && kim.equals("가위") ||
                hong.equals("보") && kim.equals("바위"))

            System.out.println("인표가 이겼습니다.");

        else if (kim.equals("가위") && hong.equals("보") ||
                kim.equals("바위") && hong.equals("가위") ||
                kim.equals("보") && hong.equals("바위"))

            System.out.println("용선이 이겼습니다.");

        else
            System.out.println("비겼다.");
    }

}