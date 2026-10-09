package OOP.Inheritance;

class Animala {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Doga extends Animala {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Doga {
    void play() {
        System.out.println("Puppy plays");
    }
}

class Multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}
