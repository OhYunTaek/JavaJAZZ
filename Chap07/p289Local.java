/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class p289Local {
    private String s1 = "외부";

    void method() {
        int x = 1;
        class LocalClass {
            String s2 = "내부";
            String s3 = s1;

            public void show() {
                System.out.println("지역 클래스");
                // x = 2;
                // x는 mothod() 내부에 선언된 지역 변수이다
                // 지역변수는 사실상 final이므로 수정할 수 없다
            }
        }

        LocalClass lc = new LocalClass();
        System.out.println(lc.s2);
        lc.show();
    }

    public static void main(String[] args) {
        p289Local lcd = new p289Local();
        lcd.method();
    }
}