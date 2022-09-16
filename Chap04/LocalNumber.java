/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//지역변수 사용 범위 연습

// 메인클래스 선언
public class LocalNumber {
    // 메인클래스 메서드 입력
    public static void main(String[] args) {
        // 변수a, b 선언
        int a = 0;
        double b;

        // 사용 못 함 초기화 해야함
        // System.out.print(b);
        // 선언 안된 변수c 때문에 마찬가지로 사용 안 됨
        // System.out.print(a + c);

        // 변수c 선언
        int c = 0;

        // 지역 변수 public 지정 안 됨
        // public double d = 0.0;

        // for 문 입력
        for (int e = 0; e < 10; e++) {
            // 이미 선언된 변수라서 블록 달라도 재선언 안 됨
            // int a = 1;
            System.out.print(e);
        }
    }
}