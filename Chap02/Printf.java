/*
 * Code by OhYunTaek. 2022.09.13(화) 
 */

public class Printf {

    public static void main(String[] args) {
        int i = 97;
        String s = "Java";
        double f = 3.14f;

        System.out.printf("%d\n", i);
        System.out.printf("%c\n", i);
        System.out.printf("%05d\n", i);
        System.out.printf("%e\n", f);
        System.out.printf("%-4.1f\n", f);
    }
}