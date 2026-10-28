
abstract class engine {

    private String E = "V6";
    private int speed;
    protected int gears;

    void setspeed(int speed) {
        this.speed = speed;
    }

    int getspeed() {
        return speed;
    }

}

class accelerator extends engine {
    boolean clutch = false;

    protected void speed(int kmph) {
        if (kmph == 0) {
            clutch = true;
        }
        if (kmph <= 10) {
            gears = 1;
        } else if (kmph > 10 && kmph <= 25) {
            gears = 2;
        } else if (kmph > 25 && kmph <= 50) {
            gears = 3;
        } else if (kmph > 50 && kmph <= 80) {
            gears = 4;
        } else if (kmph > 80 && kmph <= 120) {
            gears = 5;
        } else {
            gears = 6;
        }
    }

}

class features extends accelerator{
    boolean ADAS = true;
    String breaks = "DISC BREAK";
    boolean climatecontrol = true;
}

class interior extends features {

    final int sitter = 7;
    boolean musicsystem = true;

}

class exterior extends interior{

    public String color = "Black";
    public String alloys = "Diamond";

}

class DieselCar extends exterior{
    public final String Name = "Scorpio S11";
    public final int doors = 5;
}

public class inheritances extends DieselCar {

    DieselCar C = new DieselCar();

    inheritances() {
        C.setspeed(55);
        System.out.println(C.getspeed() + " : " + C.gears);
    }
}


/*
exterior -> interior -> features -> accelerator -> engine
*/