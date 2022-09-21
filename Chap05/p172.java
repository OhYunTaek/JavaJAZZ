/**
 * Code By OhYunTaek. 2022.09.19(월)
 */

public class p172 {
    public static void main(String[] args) {
        String s1 = "Hi, Java!";
        String s2 = new String("Hi, Java!");
        String s3 = "Hi, Code!";
        String s4 = "Hi, java!";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s3.compareTo(s4));
        System.out.println("Hi, Java!".compareToIgnoreCase("Hi, java!"));
    }
}