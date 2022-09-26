/*
 * Code By OhYunTaek 2022.09.23(금)
 */
class Mouse {
    String name;

    public Mouse(String name) {
        this.name = name;
    }
}

class p314Keyboard {
    String name;

    public p314Keyboard(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p314Keyboard) {
            p314Keyboard k = (p314Keyboard) obj;
            if (name.equals(k.name))
                return true;
        }

        return false;
    }

    public String toString() {
        return "키보드이다";
    }
}