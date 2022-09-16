/*
 * Code by OhYunTaek. 2022.09.15(목) 
 */

//class 선언 및 객체 생성 연습

//클래스 선언
class Phone {
    // 스트링 입력
    String model;
    // 인트 입력
    int value;

    // 보이드 프린트메서드 입력
    void print() {
        // 프린트 방식 및 내용 입력
        System.out.println(value + "만 원짜리 " + model + " 스마트폰");
    }
}

// 메인클래스 선언
public class TelePhone {
    // 메인클래스 입력
    public static void main(String[] args) {
        // 클래스 객체 지정
        Phone myPhone = new Phone();
        myPhone.model = "갤럭시 S30";
        myPhone.value = 100;
        myPhone.print();
        // 클래스 객체 지정2
        Phone yourPhone = new Phone();
        yourPhone.model = "NOTE30";
        yourPhone.value = 85;
        yourPhone.print();
    }
}