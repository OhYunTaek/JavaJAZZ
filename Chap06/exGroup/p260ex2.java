package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 접근자
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // 설정자
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person {
    int class_num;

    Student(String name, int age, int class_num) {
        super(name, age);
        this.class_num = class_num;
    }

    // 접근자
    int getClass_num() {
        return class_num;
    }

    // 설정자
    void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + "]");
    }
}

class ForeignStudent extends Student {
    String country;

    ForeignStudent(String name, int age, int class_num, String country) {
        super(name, age, class_num);
        this.country = country;
    }

    // 접근자
    String getCountry() {
        return country;
    }

    // 설정자
    void setCountry(String country) {
        this.country = country;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + ", 국적 : " + country + "]");
    }
}

public class p260ex2 {
    public static void main(String[] args) {
        Person[] p = { new Person("오윤택", 33), new Student("홍인표", 28, 100),
                new ForeignStudent("이예현", 18, 200, "U.S.A") };

        for (Person k : p) {
            System.out.println(k.show());
        }
    }
}