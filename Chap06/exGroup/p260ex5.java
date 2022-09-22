package exGroup;

/*
 * Code By OhYunTaek 2022.09.22(목)
 */

class Phone {
    protected String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void talk() {
        System.out.println(owner + " 대리님이 통화중이다");
    }
}

class Telephone extends Phone {
    private String when;

    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    void autoAnswering() {
        System.out.println(owner + " 대리님이 없다 " + when + " 전화 주세요");
    }
}

class Smartphone extends Telephone {
    private String game;

    Smartphone(String owner, String game) {
        super(owner, "when");
        this.game = game;
    }

    void playGame() {
        System.out.println(owner + " 대리님이 " + game + " 게임을 하는 중이다");
    }
}

public class p260ex5 {
    public static void main(String[] args) {
        Phone[] phones = { new Phone("오윤택"), new Telephone("김호진",
                "내일"), new Smartphone("김우송", "스타크래프트") };

        for (Phone phone : phones) {
            if (phone instanceof Smartphone) {
                ((Smartphone) phone).playGame();
            } else if (phone instanceof Telephone) {
                ((Telephone) phone).autoAnswering();
            } else if (phone instanceof Phone) {
                phone.talk();
            }
        }
    }
}