import java.util.function.Supplier;

/*
 * Code By OhYunTaek 2022.09.30(금)
 */
public class p430ex6 {
    public static void main(String[] args) {
        soundAnimal(Animal::new);
        soundAnimal(Dog::new);
    }

    public static void soundAnimal(Supplier<Animal> s) {
        s.get().sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("ㅁㅁㄲㄲ...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}