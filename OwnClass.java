package demopackage;

class myclass {

    int id;
    String name;
} 


public class OwnClass{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        myclass obj = new myclass();
        obj.id = 1;
        obj.name = "Anshh Rohatgi";
        System.out.println(obj.name +" "+ obj.id);
    }
        
}
