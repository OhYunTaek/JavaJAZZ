/**
 * Code By OhYunTaek. 2022.09.19(월)
 */

public class p189 {
    public static void main(String[] args) {
        if (args.length == 2) {
            int i = Integer.parseInt(args[1]);
            nPrintln(args[0], i);
        } else
            System.out.println("어이쿠!");
    }
    // 이클립스에서 아규먼트 안녕! 추가를 안했으므로 어이쿠! 가 출력된다

    public static void nPrintln(String s, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }
}