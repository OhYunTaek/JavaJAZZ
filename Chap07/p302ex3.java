import java.util.Arrays;

/*
 * Code By OhYunTaek 2022.09.23(금)
 */
public class p302ex3 {
    public static void main(String[] args) {
        Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

        System.out.println("정렬 전");
        for (Book e : books)
            e.print();

        Arrays.sort(books);
        System.out.println("정렬 후");
        for (Book e : books)
            e.print();
    }
}

class Book implements Comparable {
    int price;

    public Book(int price) {
        this.price = price;
    }

    void print() {
        System.out.println("Book [price=" + price + "]");
    }

    @Override
    public int compareTo(Object o) {
        if (price > ((Book) o).price)
            return 1;
        else if (price == ((Book) o).price)
            return 0;
        else
            return -1;
    }
}