/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p379ex1 implements Comparable<p379ex1> {
    String name;
    int score;

    public p379ex1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " , " + score;
    }

    public int compareTo(p379ex1 es) {
        return score - es.score;
    }
}

class EnglishTest {
    static p379ex1 findBest(p379ex1[] a) {
        p379ex1 best = a[0];

        for (int i = 0; i < a.length; i++) {
            if (best.compareTo(a[i]) < 0)
                best = a[i];
        }

        return best;
    }

    public static void main(String[] args) {
        p379ex1[] ea = { new p379ex1("임꺽정", 77),
                new p379ex1("김선달", 88), new p379ex1("홍길동", 99)
        };

        System.out.println("영어 최고 점수 : " + findBest(ea));
    }
}