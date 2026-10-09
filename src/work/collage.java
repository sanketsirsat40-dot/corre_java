package work;

class coll{
    void cname(){
        System.out.println("H.V.P.M");
    }
}

class couse extends coll{
    void name(){
        System.out.println("Bsc");
    }
}

class year extends couse{
    void bsc(){
        System.out.println("III year");
    }
}
public class collage {
    static void main(String[] args) {
        year s=new year();
        s.cname(); s.name();
        s.bsc();


    }
}
