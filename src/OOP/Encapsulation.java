package OOP;


class Studente {
    private String name;   // hidden data

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Studente s = new Studente();
        s.setName("Sanket");
        System.out.println(s.getName());
    }
}