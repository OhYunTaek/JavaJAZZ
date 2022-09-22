/*
 * Code By OhYunTaek 2022.09.22(목)
 */
class Icon {
    interface Touchable {
        void touch();
    }
}

public class p290Inner implements Icon.Touchable {
    public void touch() {
        System.out.println("아이콘을 터치한다");
    }

    public static void main(String[] args) {
        Icon.Touchable btn = new p290Inner();
        btn.touch();
    }
}