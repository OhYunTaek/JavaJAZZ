// /*
//  * Code by OhYunTaek. 2022.09.19(월) 
//  */

class Member1 {

    private String name;
    private String id;
    private String password;
    private int age;

    public Member1(String name, String password, String id, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class p164ex3 {
        public static void main(String[] arge) {
            Member1 a = new Member1("오윤택", "OYT", "1234", 33);
            System.out.println(a.getName());
            System.out.println(a.getId());
            System.out.println(a.getPassword());
            System.out.println(a.getAge());
        }
    }
}
