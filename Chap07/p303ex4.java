/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p303ex4 {
    static void speak(Talkable o) {
        o.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}

interface Talkable {
    void talk();
}

class Korean implements Talkable {
    public Korean() {
    }

    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable {
    public American() {
    }

    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}