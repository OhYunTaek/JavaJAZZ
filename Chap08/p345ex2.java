/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex2 {
    public static void main(String[] args) {
        System.out.println(new Student1("오윤택"));
        System.out.println(new Student1("오세빈"));
    }
}

class Student1 {
    String name;

    public Student1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "학생[" + name + "]";
    }
}