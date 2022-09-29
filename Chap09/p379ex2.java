/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p379ex2 implements Comparable<p379ex2> {
    String name;
    int score;

    public p379ex2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " , " + score;
    }

    @Override
    public int compareTo(p379ex2 o) {
        return score - o.score;
    }
}

class MathScore implements Comparable<MathScore> {
    String name;
    int score;

    public MathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " , " + score;
    }

    @Override
    public int compareTo(MathScore o) {
        return score - o.score;
    }
}

class EnglishTest2 {
    static <T extends Comparable> T findBest(T[] a) {
        T best = a[0];

        for (int i = 0; i < a.length; i++) {
            if (best.compareTo(a[i]) < 0)
                best = a[i];
        }

        return best;
    }

    public static void main(String[] args) {
        p379ex2[] ea = { new p379ex2("임꺽정", 77),
                new p379ex2("김선달", 88),
                new p379ex2("홍길동", 99)
        };
        MathScore[] ma = { new MathScore("임꺽정", 97),
                new MathScore("김선달", 99),
                new MathScore("홍길동", 30)
        };

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));
    }
}