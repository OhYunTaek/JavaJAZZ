/*
 * Code By OhYunTaek 2022.09.28(수)
 */
public class p370Entry2 {
    public static void main(String[] args) {
        p370Entry1<String, Integer> e1 = new p370Entry1<>("김선달", 20);
        p370Entry1<String, String> e2 = new p370Entry1<>("기타", "등등");
        System.out.println(e1.getKey() + " " + e1.getValue());
        System.out.println(e2.getKey() + " " + e2.getValue());
    }
}