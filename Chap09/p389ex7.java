/*
 * Code By OhYunTaek 2022.09.29(목)
 */
public class p389ex7 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(new Integer(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}

class Box<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
}