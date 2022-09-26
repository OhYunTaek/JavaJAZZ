/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p319String {
    public static void main(String[] args) {
        String a = new String("hi");
        System.out.println(a.hashCode());
        a = a + "!";
        System.out.println(a.hashCode());

        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb.hashCode());
        sb = sb.append("!");
        System.out.println(sb.hashCode());

        System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java, "));
    }
}