/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p379ex3 implements Comparable<p379ex3> {
    String name;
    int score;
    private p379ex3 o;

    public p379ex3(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " , " + score;
    }

    @Override
    public int compareTo(p379ex3 o) {
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

class EnglishTest3 {
    static <T extends Comparable> T findBest(T[] a) {
        T best = a[0];

        for (int i = 0; i < a.length; i++) {
            if (best.compareTo(a[i]) < 0)
                best = a[i];
        }

        return best;
    }

    static <T> T findBest(T[] a, String name) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].toString().substring(0, name.length()).equals(name))
                return a[i];
        }
        return null;
    }

    public static void main(String[] args) {
        p379ex3[] ea = { new p379ex3("임꺽정", 77),
                new p379ex3("김선달", 88),
                new p379ex3("홍길동", 99)
        };
        MathScore[] ma = { new MathScore("임꺽정", 97),
                new MathScore("김선달", 99),
                new MathScore("홍길동", 30)
        };
        String name = null;

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));

        try {
            findBest(ea, name);
            findBest(ma, name);
        } catch (NullPointerException e) {
            System.out.println("명령행 인자가 없습니다");
        } catch (Exception e) {
            System.out.println("읔엨!!!");
        }
    }
}