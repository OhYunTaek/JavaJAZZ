/*
 * Code By OhYunTaek 2022.09.23(금)
 */

class Hotel2 {
    class Room2 {
        int number2;
        String client2;

        public Room2(int number2, String client2) {
            this.number2 = number2;
            this.client2 = client2;
        }
    }

    Room2[] rooms = new Room2[10];

    void add(int number, String client) {
        rooms[number] = new Room2(number, client);
    }

    void show() {
        for (Room2 a : rooms) {
            if (a != null)
                System.out.println(a.number2 + "호 방을" + a.client2 + "이 예약함");
        }
    }
}

public class p307ex9 {
    public static void main(String[] args) {
        Hotel2 hotel2 = new Hotel2();
        hotel2.add(101, "달마시안");
        hotel2.add(102, "도베르만");
        hotel2.show();
    }
}