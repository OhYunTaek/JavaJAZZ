// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class printer1 {
    int numOfPapers = 0;

    public void print(int amount) {
        numOfPapers -= amount;
    }
}

public class p158ex1 {
    public static void main(String[] args) {
        printer1 myPrinter = new printer1();
        myPrinter.numOfPapers = 100;
        myPrinter.print(70);
        System.out.println(myPrinter.numOfPapers);
    }
}