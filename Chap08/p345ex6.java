import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex6 {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat abc1 = new SimpleDateFormat("yyyy.MM.dd 오후 hh:mm:ss");
        System.out.println(abc1.format(now));
        SimpleDateFormat abc2 = new SimpleDateFormat("오늘은 MM월의 dd번째 날");
        System.out.println(abc2.format(now));
        SimpleDateFormat abc3 = new SimpleDateFormat("오늘은 yyyy년의 DDD번째 날");
        System.out.println(abc3.format(now));
    }
}