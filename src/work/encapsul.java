package work;

import javax.xml.namespace.QName;

class Employee{
    private int id;
    private String name;
    private double salary;

    public void creat(int idemp,String empname, double empsalary){
        idemp=id;
        empname=name;
        empsalary=salary;
        System.out.println("Employee is join");
    }

    public void empinformation(){
        System.out.println("Employee id :"+id);
        System.out.println("Employee Name :"+name);
        System.out.println("Employee salary :"+salary);
        System.out.println("--------------------------------");
    }

}


public class encapsul {
    static void main(String[] args) {
        Employee s1=new Employee();
        s1.creat(01,"sanket sirsat",50000);
        s1.empinformation();
        Employee s2=new Employee();
        s2.creat(01,"aniket",70000);
        s2.empinformation();
    }
}
