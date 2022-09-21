/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex2 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int arr[] = { 2, 3 };
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }

    // 자바는 가변 길이 변수를 배열처럼 취급하기 때문에 sum() 메서드
    // 하나만으로 해결할 수 있다
    private static int sumExceptFirst(int i, int... j) {
        int sum2 = 0;
        for (int k : j) {
            sum2 += k;
        }
        return sum2;
    }
}