/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p358TryCatch2 {
    public static void main(String[] args) {
        int dividend = 10;
        try {
            int divisor = Integer.parseInt(args[0]);
            System.out.println(dividend / divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("원소가 존재하지 않습니다");
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아니다");
        } catch (ArithmeticException e) {
            System.out.println("0으로 못나눠");
        } finally {
            System.out.println("항상 실행됨");
        }
        System.out.println("종료");
    }
}