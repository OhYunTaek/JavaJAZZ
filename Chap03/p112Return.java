/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

public class p112Return {
    public static void main(String[] args) {
        printScore(99);
        printScore(130);
    }

    public static void printScore(int score) {
        // 1~100이 아닌 점수는 잘못된 점수라고 출력하고는 종료한다
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수 : " + score);
            return;
        }
        System.out.println("점수 : " + score);
    }
}