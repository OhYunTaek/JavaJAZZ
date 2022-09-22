package sec08;

/*
 * Code By OhYunTaek 2022.09.21(수)
 */
public class p241Upcast {
    public static void main(String[] args) {
        p240Person p;
        p240Student s = new p240Student();

        p = s;
        p.whoami();
    }
}