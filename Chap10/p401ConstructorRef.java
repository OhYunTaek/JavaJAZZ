interface NewObject<T> {
    T getObject(T o);
}

interface NewArray<T> {
    T[] getArray(int size);
}

/*
 * Code By OhYunTaek 2022.09.29(금)
 */
public class p401ConstructorRef {
    public static void main(String[] args) {
        NewObject<String> s;
        NewArray<Integer> i;

        s = String::new;
        String str = s.getObject("사과");

        i = Integer[]::new;
        Integer[] array = i.getArray(2);
        array[0] = 10;
        array[1] = 20;
    }
}