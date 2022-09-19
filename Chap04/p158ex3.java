// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Printer3 {
    private int numOfPapers;
    private boolean abc;

    public Printer3(int numOfPapers, boolean abc) {
        this.numOfPapers = numOfPapers;
        this.abc = abc;
    }

    public void printb(int amount) {
        if (this.abc == false) {
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다");
            } else if (amount > numOfPapers) {
                System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다",
                        amount - numOfPapers, numOfPapers);
                System.out.println();
                numOfPapers = 0;
            } else {
                numOfPapers -= amount;
                System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.", amount, numOfPapers);
                System.out.println();
            }
        } else {
            int xyz;
            if (amount % 2 == 0) {
                xyz = amount / 2;
            } else {
                xyz = amount / 2 + 1;
            }
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다");
            } else if (xyz > numOfPapers) {
                System.out.printf("양면으로 모두 출력하려면 용지가 %4매 부족합니다. %d장만 출력합니다",
                        xyz - numOfPapers, numOfPapers);
                System.out.println();
                numOfPapers = 0;
            } else {
                numOfPapers -= xyz;
                System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.", xyz, numOfPapers);
                System.out.println();
            }
        }
    }

    public boolean getAbc() {
        return abc;
    }

    public void setAbc(boolean abc) {
        this.abc = abc;
    }
}

public class p158ex3 {
    public static void main(String[] args) {
        Printer3 p = new Printer3(20, true);
        p.printb(25);
        p.setAbc(false);
        p.printb(10);
    }
}