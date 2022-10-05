package sec03;

import java.util.*;

public class HashMap2Demo {
    public static void main(String[] args) {
        Map<Fruit, Integer> map = new HashMap<>();
        map.put(new Fruit("사과"), 5);
        map.put(new Fruit("사과"), 2);
        map.put(null, 3);
        System.out.println(map.size());
        System.out.println(map);
    }
}

class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o instanceof Fruit)
            return ((Fruit) o).name.equals(name);
        return false;
    }

    public int hashcode() {
        return name != null ? name.hashCode() : 0;
    }

    public String toString() {
        return String.format("Fruit(%s)", name);
    }
}