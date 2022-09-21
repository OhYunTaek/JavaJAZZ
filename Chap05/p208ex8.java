import java.util.Scanner;

/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex8 {
    public static void main(String[] args) {
        String s;
        String r;

        Scanner in = new Scanner(System.in);
        System.out.printf("요일을 영어로 입력하세요(예=MONDAY) : ");
        s = in.next();
        r = s.toUpperCase();

        System.out.print(Days.valueOf(r) + "은 ");
        printDays(r);

    }

    public static void printDays(String s) {
        String d = Days.valueOf(s).toString();
        switch (d) {
            case "월요일" -> System.out.println("싫다");
            case "금요일" -> System.out.println("좋다");
            case "토요일", "일요일" -> System.out.println("최고");
            default -> System.out.println("그저 그렇다");
        }
    }

    enum Days {
        MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일"), SUNDAY("일요일");

        private String s;

        Days(String s) {
            this.s = s;
        }

        public String toString() {
            return s;
        }
    }
}