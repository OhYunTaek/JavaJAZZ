import java.util.function.UnaryOperator;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p430ex5 {
    public static void main(String[] args) {
        FirstString f = new FirstString();
        UnaryOperator<String> o = f::startsWith;
        System.out.println(o.apply("Hello!"));
    }
}

class FirstString {
    String startsWith(String s) {
        return Character.toString(s.charAt(0));
    }
}