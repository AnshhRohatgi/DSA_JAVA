
class A{
    private int age;
    private String name;

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }
    
    public void setname(String name){
        this.name = name;
    }

    public void setage(int age){
        this.age = age;
    } 

}

class B{
    int marks;
    String Dept;

    public String getDept(){
        return Dept;
    }

    public int getmarks(){
        return marks;
    }
    
    public void setDept(String Dept){
        this.Dept = Dept;
    }

    public void setmarks(int marks){
        this.marks =  marks;
    } 

}

class C{
    final String Rollno = "0100";

    // public int getRollno(){
    //     return Rollno;
    // }
}

public class Accessmod {
    public static void main(String [] args){
        
        A ob1 = new A();
        ob1.setname("Anshh");
        ob1.setage(18);
        System.out.println(ob1.getname());
        System.out.println(ob1.getage());

        B ob2 = new B();
        ob2.setDept("CSE");
        ob2.setmarks(458);
        System.out.println(ob2.getDept());
        System.out.println(ob2.getmarks());

        // setDept("Anshh");
        // setmarks(18);
        // System.out.println(getDept());
        // System.out.println(getmarks());

        C ob3 = new C();
        System.out.println(ob3.Rollno);

    }
}
