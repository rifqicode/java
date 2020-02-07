package Mobil;

public class MobilGo extends Mobil {

    public MobilGo(String name) {
        super(name);
    }

    public void nextGear() {
        if (this.engine == 0) {
            System.out.println(" Mesin Belum Dinyalakan ");
            return;
        }

        if (this.gear == this.maxGear) {
            System.out.println(" Ada sudah berada di gigi maximal ");
            return;
        }

        this.gear += 1;
        System.out.println("Ganti ke gigi : " + this.gear);
    }

    @Override
    public String toString() {
        return "Name : " + this.name;
    }


    public void print() {
        System.out.println("Mobil Saya Adalah" + this.name);
    }
}
