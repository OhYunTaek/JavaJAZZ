// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Car1 {

    private String color;
    static int numOfCar = 0;
    static int numOfRedCar = 0;

    public Car1(String color) {
        this.color = color;
        numOfCar++;

        if (color.equalsIgnoreCase("red"))
            numOfRedCar++;
    }

    static public int getNumberOfCar() {
        return numOfCar;
    }

    static public int getNumberOfRedCar() {
        return numOfRedCar;
    }

    public class p164ex4 {
        public static void main(String[] arge) {
            Car1 c1 = new Car1("red");
            Car1 c2 = new Car1("blue");
            Car1 c3 = new Car1("RED");

            System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",
                    Car1.getNumberOfCar(), Car1.getNumberOfRedCar());
        }
    }
}
