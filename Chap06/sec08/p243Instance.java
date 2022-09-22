package sec08;

/*
 * Code By OhYunTaek 2022.09.21(수)
 */
public class p243Instance {
    public static void main(String[] args) {
        p240Student s = new p240Student();
        p240Person p = new p240Person();

        System.out.println(s instanceof p240Person);
        System.out.println(s instanceof p240Student);
        System.out.println(p instanceof p240Student);

        downcast(s);
    }

    static void downcast(p240Person p) {
        if (p instanceof p240Student) {
            p240Student s = (p240Student) p;
            System.out.println("좋아, 하향 타입 변환");
        }
    }
}