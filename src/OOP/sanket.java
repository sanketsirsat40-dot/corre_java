package OOP;
class print{

    void name(String name, String sirname){
        System.out.println(name);
    }
    void fullname(String name, String sirname){

        System.out.println(name+sirname);
    }
}
public class sanket {
    static void main(String[] args) {
        print s1=new print();



        s1.name("sanket","sirsat");
        s1.fullname("sanket","sirsat");
    }
}
