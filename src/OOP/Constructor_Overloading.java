package OOP;
class Studentt {

    String name;
    int age;

    Studentt() {
        System.out.println("No details");
    }

    Studentt(String name) {
        this.name = name;
    }

    Studentt(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Constructor_Overloading {
    static void main(String[] args) {
        Studentt s1 = new Studentt();

        Studentt s2 = new Studentt("Sanket");

        Studentt s3 = new Studentt("Sanket", 20);

    }
}
