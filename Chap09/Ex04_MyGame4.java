/*
 * Code By OhYunTaek 2022.09.28(수)
 */
class Npc4 {
    public String toString() {
        return "This is a Npc4.";
    }
}

class Tank4 {
    public String toString() {
        return "This is a Tank4.";
    }
}

class Camp4 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex04_MyGame4 {
    public static void main(String[] args) {
        Camp4 human = new Camp4();
        Camp4 machine = new Camp4();

        human.set("난 다이노소어");
        machine.set("난 외계인");

        System.out.println(human.get());
        System.out.println(machine.get());
    }
}