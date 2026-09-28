package OOP;
class Student {

    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}

public class Example {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Sanket";
        s1.age = 20;

        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.study();

    }
}
