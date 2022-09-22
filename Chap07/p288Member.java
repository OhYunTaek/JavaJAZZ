/*
 * Code By OhYunTaek 2022.09.22(목)
 */
public class p288Member {
    private String secret = "비공개";
    String s = "외부";

    class MemberClass {
        String s = "내부";

        public void show1() {
            System.out.println("내부 클래스");
            System.out.println(secret);

            System.out.println(s);

            System.out.println(p288Member.this.s);
        }

        // static String ss = "정적 멤버 필드";
        // Static void show2() {}
        // 내부 클래스 내부에 정적 변수나 메서드를 포함할 수 없다
    }

    public static void main(String[] args) {
        p288Member m = new p288Member();
        p288Member.MemberClass m1 = m.new MemberClass();

        System.out.println(m1.s);
        m1.show1();
    }
}