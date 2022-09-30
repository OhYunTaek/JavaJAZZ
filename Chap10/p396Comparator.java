import java.util.*;

/*
 * Code By OhYunTaek 2022.09.29(금)
 */
public class p396Comparator {
    public static void main(String[] args) {
        String[] strings = { "로마에 가면 로마법을 따르라.",
                "시간은금이다.", "펜은 칼보다 강하다." };

        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        });

        for (String s : strings)
            System.out.println(s);
    }
}