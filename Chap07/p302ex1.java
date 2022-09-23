/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p302ex1 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}

abstract class Abstract {
    int i;

    abstract void show();
}

class Concrete extends Abstract {
    int j;

    public Concrete(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}