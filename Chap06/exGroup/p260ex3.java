package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */
class Point {
    private int a1, b1;

    Point(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    int getA() {
        return a1;
    }

    int getB() {
        return a1;
    }

    void setA(int a1) {
        this.a1 = a1;
    }

    @Override
    public String toString() {
        return "Point [x=" + a1 + ",y=" + b1 + "]";
    }
}

class p260ex3 extends Point {
    private int a2, b2;

    p260ex3(int a1, int b1, int a2, int b2) {
        super(a1, b1);
        this.a2 = a2;
        this.b2 = b2;
    }

    int geta2() {
        return a2;
    }

    int getb2() {
        return b2;
    }

    void seta2(int a2) {
        this.a2 = a2;
    }

    void setb2(int b2) {
        this.b2 = b2;
    }

    @Override
    public String toString() {
        return "p260ex3 [a1=" + getA() + ",b1=" + getB() + "a2=" +
                ",b2=" + b2 + "]";
    }
}