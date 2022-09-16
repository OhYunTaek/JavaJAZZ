// /*
//  * Code by OhYunTaek. 2022.09.16(금) 
//  */

// // 클래스 선언
// class Circlec {
//     double radius;
//     String color;

//     public Circlec(double r, String c) {
//         radius = r;
//         color = c;
//     }

//     public Circlec(double r) {
//         radius = r;
//         color = "파랑";
//     }

//     public Circlec(String c) {
//         radius = 10.0;
//         color = c;
//     }

//     public Circlec() {
//         radius = 10.0;
//         color = "빨강";
//     }
// }

// // 메인메서드 선언
// public class Circle4 {
//     public static void main(String[] args) {
//         Circlec c1 = new Circlec(10.0, "빨강");

//         Circlec c2 = new Circlec(5.0);

//         Circlec c3 = new Circlec("노랑");

//         Circlec c4 = new Circlec();

//         Circlec c5 = new Circlec();

//         System.out.println(c1);
//         System.out.println(c2);
//         System.out.println(c3);
//         System.out.println(c4);
//         System.out.println(c5);
//     }
// }

// 클래스 선언
class Circlec {
    double radius;
    String color;

    void show() {
        System.out.println(radius + " " + color);
    }

    public Circlec(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circlec(double radius) {
        this(radius, "파랑");
    }

    public Circlec(String color) {
        this(10.0, color);
    }

    public Circlec() {
        this(10.0, "빨강");
    }

    public static void main(String[] args) {
        Circlec prt = new Circlec();
        prt.show();
    }
}
