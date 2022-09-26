import java.util.Random;

/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p333Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 5; i++)
            System.out.print(r.nextInt(50) + " ");
    }
}