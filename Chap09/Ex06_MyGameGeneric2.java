/*
 * Code By OhYunTaek 2022.09.28(수)
 */
class Npc6 {
    public String toString() {
        return "This is a Npc4.";
    }
}

class Tank6 {
    public String toString() {
        return "This is a Tank4.";
    }
}

class Camp6<T> {
    private T unit;

    public void set(T unit) {
        this.unit = unit;
    }

    public T get() {
        return unit;
    }
}

public class Ex06_MyGameGeneric2 {
    public static void main(String[] args) {
        Camp6<Npc6> human = new Camp6<>();
        Camp6<Tank6> machine = new Camp6<>();

        human.set(new Npc6());

        Npc6 hUnit = human.get();
        Tank6 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}