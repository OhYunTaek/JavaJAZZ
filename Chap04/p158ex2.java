// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Printer2 {
    private int numOfPapers = 0;

    public Printer2(int a) {
        numOfPapers = a;
    }

    public void printa(int amount) {
        if (numOfPapers == 0) {
            System.out.println("용지가 없습니다");
        } else if (amount > numOfPapers) {
            System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다",
                    amount - numOfPapers, numOfPapers);
            System.out.println();
            numOfPapers = 0;
        } else {
            numOfPapers -= amount;
            System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.", amount, numOfPapers);
            System.out.println();
        }
    }
}

public class p158ex2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2(10);
        p.printa(2);
        p.printa(20);
        p.printa(10);
    }
}