package OOP.Polymorphism;

class Demo {
    void show(int a) {
        System.out.println(a);
    }

    void show(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show(10);
        obj.show("Hello");
    }
}
