
public class method {
    double area;

    // METHOD OVERLOADING --->

    double Area(double raidus) {
        area = 3.14 * raidus * raidus;
        return area;
    }

    double Area(double length, double breadth) {
        area = length * breadth;
        return area;
    }

    // METHOD OVERRIDDING --->
    
    double Area(float size) {
        area = size * size;
        return area;
    }

    double Area(float height, float base) {
        area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        method obj = new method();

        System.out.println("Rectrangle : " + obj.Area(10.0, 10.0));
        System.out.println("Square : " + obj.Area(5.0f));
        System.out.println("Circle : " + obj.Area(5.0));
        System.out.println("Triangle : " + obj.Area(10.0f, 10.0f));

    }

}
