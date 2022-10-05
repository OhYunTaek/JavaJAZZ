package sec04;

import java.util.*;

public class EtcDemo {
    public static void main(String[] args) {
        List<String> list1 = List.of("개발자 ", "오윤택 ", "3년 뒤 ", "회사 차림 ",
                "오윤택 ", "3년 뒤 ");

        HashSet<String> set = new HashSet<>(list1);

        List<String> list2 = new ArrayList<>(set);
        Collections.sort(list2);

        for (String fruit : list2) {
            System.out.printf("%s : %d\n", fruit,
                    Collections.frequency(list1, fruit));
        }
    }
}