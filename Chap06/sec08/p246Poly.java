package sec08;

/*
 * Code By OhYunTaek 2022.09.21(수)
 */
class SportsCar extends Car {
    void whoami() {
        System.out.println("나는 스포츠 카 다");
    }
}

public class p246Poly {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new SportsCar();

        for (Vehicle v : vehicles)
            v.whoami();
    }
}