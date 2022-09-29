/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p359TryCatch3 {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2 };
        try {
            int x = array[3];
        } catch (Exception e) {
            System.out.println("어잌후!!!");
            // 이부분 ArrayIndexOutOfBoundsException 위치 오류예제
            // } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("원소가 존재하지 않음");
        }
        System.out.println("종료");
    }
}