/*
 * Code By OhYunTaek 2022.09.28(수)
 */
class Npc3 {
    public String toString() {
        return "This is a Npc3.";
    }
}

class Tank3 {
    public String toString() {
        return "This is a Tank3.";
    }
}

class Camp3 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex03_MyGame3 {
    public static void main(String[] args) {
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        human.set(new String("난 다이노소어"));
        machine.set(new String("난 외계인"));

        Npc3 hUnit = (Npc3) human.get();
        Tank3 mUnit = (Tank3) machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}