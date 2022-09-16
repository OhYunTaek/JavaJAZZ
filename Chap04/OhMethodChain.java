// /*
//  * Code by OhYunTaek. 2022.09.16(금) 
//  */

class YunTaek {
    String name;
    int age;

    public YunTaek setName(String name) {
        this.name = name;
        return this;
    }

    public YunTaek setAge(int age) {
        this.age = age;
        return this;
    }

    public void sayYes() {
        System.out.println("하이, 나는 " + name + "인데 " + age + "살이다 ");
    }
}

public class OhMethodChain {
    public static void main(String[] args) {
        YunTaek oyt = new YunTaek();
        YunTaek tyo = new YunTaek();
        oyt.setName("대한").setAge(21).sayYes();
        tyo.setName("오윤택").setAge(13).sayYes();
    }
}