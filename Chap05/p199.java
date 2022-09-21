/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p199 {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "은 병역 의무가 있다");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다");
        System.out.println(Gender.GENDERX + "은 도망가야 한다");

        for (Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
    }
}

enum Gender {
    MALE("남성"), FEMALE("여성"), GENDERX("중성");

    private String s;

    Gender(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}