package Mobil;

public class Mobil {

    public int engine = 0;
    public int gear = 0;
    public String name;
    final static int maxGear = 4;

    public Mobil(String name) {
        this.name = name;
    }

    public void start() {
        this.engine = 1;
        System.out.println(" Engine Start ");
    }

    public int engineStatus() {
        return this.engine;
    }

    public void gearStatus() {
        System.out.println(" Anda berada di gigi : " + this.gear);
    }

    protected void status() {
        System.out.println(" Status Mesin : " + this.engine);
    }

    @Override
    public String toString() {
        return "Name : " + this.name;
    }

    public void print() {
        System.out.println("Mobil Saya Adalah " + this.name);
    }

}
