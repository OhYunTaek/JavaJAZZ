package sec04;

import java.util.*;

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = { "개발자 ", "오윤택 ", "3년 뒤 ", "회사 차림 " };
        List<String> list = Arrays.asList(s);

        Collections.sort(list);
        System.out.println(list);
        int i = Collections.binarySearch(list, "오윤택");
        System.out.println(i);
    }
}