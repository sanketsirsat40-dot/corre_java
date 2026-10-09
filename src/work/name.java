package work;

class frist_name{
    void name(){
        System.out.println("sanket");
    }
}

class sirname extends frist_name{
    void sir(){
        System.out.println("sirsat");
    }
}
public class name {
    static void main(String[] args) {
        sirname s= new sirname();

        s.name();
        s.sir();
    }
}
