/**
 * Code By OhYunTaek. 2022.09.19(월)
 */

public class p174 {
    public static void main(String[] args) {
        String a1 = new String("Hi,");
        String a2 = new String("Java!");

        System.out.println("문자열 길이(a1) : " + a1.length());
        System.out.println(a1.charAt(1));

        a1 = a1.concat(a2);

        System.out.println(a1.concat(a2) + "!");
        System.out.println(a1.toLowerCase() + "!");
        System.out.println(a1.substring(4, 8) + "!");

        String a3 = " ";
        System.out.println(a3.isEmpty());
        System.out.println(a3.isBlank());
        String a4 = "";
        System.out.println(a4.isEmpty());
        System.out.println(a4.isBlank());

        String a5 = "윤택-오";
        System.out.println(a5.repeat(3));

        System.out.println(a2.trim().indexOf("v"));
    }
}