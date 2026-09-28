package OOP;
class Studen {

    String name;
    int age;

    Studen(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Parameterized_Constructor {
    static void main(String[] args) {
        Studen s1 = new Studen("Sanket", 20);
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
