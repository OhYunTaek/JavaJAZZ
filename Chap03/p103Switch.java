/*
 * Code by OhYunTaek. 2022.09.14(수) 
 */

public class p103Switch {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("맷돼지");
        whoIsIt("독수리");
        whoIsIt("까치");
    }

    static void whoIsIt(String bio) {
        String kind = "";
        switch (bio) {
            case "호랑이":
            case "맷돼지":
                kind = "태백산";
                break;
            case "고라니":
            case "반달곰":
                kind = "지리산";
                break;
            case "독수리":
            case "올빼미":
                kind = "북한산";
                break;
            default:
                System.out.print("어이쿠! ");
                kind = "얼씨구! ";
        }
        System.out.printf("%s는 %s이다. \n", bio, kind);
    }
}