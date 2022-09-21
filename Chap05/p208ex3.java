/**
 * Code By OhYunTaek. 2022.09.20(화)
 */
public class p208ex3 {
    public static void main(String[] args) {
        for (Direction d : Direction.values())
            System.out.print(d + " ");
    }
}

enum Direction {
    동, 서, 남, 북;
}