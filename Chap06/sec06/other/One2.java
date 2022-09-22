package sec06.other;

import sec06.One;

/*
 * Code By OhYunTaek 2022.09.21(수)
 */
public class One2 extends One {
    void print() {
        // System.out.println(secret);
        // System.out.println(roommate);
        // 자식 클래스라도 부모와 다른 패키지에 있다면
        // private와 default 멤버에 접근할 수 있다
        System.out.println(child);
        System.out.println(anybody);
    }
}