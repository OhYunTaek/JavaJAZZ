package sec03;

import java.util.*;

import sec01.Util;

/*
 * Code By OhYunTaek 2022.10.05(수)
 */
// p491
// 스트림은 데이터 집합체를 반복적으로 처리하는 기능
public class Optional2Demo {
    public static void main(String[] args) {
        String s1 = "안녕!";
        // or String s1 = null;
        Optional<String> o = Optional.ofNullable(s1);

        if (s1 != null)
            Util.print(s1);
        else
            Util.print("없음");

        if (o.isPresent())
            Util.print(o.get());
        else
            Util.print("없음");

        String s2 = o.orElse("없음");
        Util.print(s2);

        o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));
    }
}