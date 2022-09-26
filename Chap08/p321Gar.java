/*
 * Code By OhYunTaek 2022.09.23(금)
 */
class Garbage1 {
    public int no;

    public Garbage1(int no) {
        this.no = no;
        System.out.printf("Garbage1(%d) 생성\n", no);
    }

    protected void finalize() {
        System.out.printf("Garbage1(%d) 수거\n", no);
    }
}

public class p321Gar {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            new Garbage1(i);

        System.gc();

        System.exit(0);
        // 이거 ()안에 아무것도 적지 않으면 에러가 나옴
    }
}