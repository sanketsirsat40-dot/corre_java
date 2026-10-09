package OOP.Inheritance;

class Animale {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Doge extends Animale {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animale {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
