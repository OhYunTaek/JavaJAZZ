import java.util.Calendar;

/*
 * Code By OhYunTaek 2022.09.26(월)
 */
public class p345ex3 {
    public static void main(String[] args) {
        String[] weekName1 = { "일", "월", "화", "수", "목", "금", "토" };
        String[] noonName1 = { "오전", "오후" };
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        String week = weekName1[c.get(Calendar.DAY_OF_WEEK) - 1];
        String noon = noonName1[c.get(Calendar.AM_PM)];

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일 ");
        System.out.println(week + "요일 " + noon);
        System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
    }
}