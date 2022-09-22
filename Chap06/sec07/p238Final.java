package sec07;

/*
 * Code By OhYunTaek 2022.09.21(수)
 */
class Good {
}

class Better extends Good {
}

final class Best extends Better {
}

public class p238Final {
    public static void main(String[] args) {
        new Best();
    }
}