/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p105Switch2 {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("반달곰");
        whoIsIt("독수리");
        whoIsIt("까치");
    }

    static void whoIsIt(String bio) {
        String kind = switch (bio) {
            case "호랑이", "맷돼지" -> kind = "태백산";
            case "고라니", "반달곰" -> kind = "지리산";
            case "독수리", "올빼미" -> kind = "북한산";
            default -> {
                System.out.print("어이쿠! ");
                yield "얼씨구! ";
            }
        };
        System.out.printf("%s는 %s이다. \n", bio, kind);
    }
}