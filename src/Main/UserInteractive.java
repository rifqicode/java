package Main;

import Mobil.MobilGo;

import java.util.Scanner;

public class UserInteractive {


    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Car Game Rifqi !");
        System.out.println("Tekan 1 untuk mulai!");

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();

        if (start == 1) {
            MobilGo mobil = new MobilGo("My Car");

            mobil.start();
            int status = mobil.engineStatus();

            while (status == 1) {
                mobil.gearStatus();

                System.out.print("Oper Gigi ( (true) : Untuk Ya , : (false) Untuk tidak ) ");
                Boolean gear = scanner.nextBoolean();

                if (gear == true) {
                    mobil.nextGear();
                }
            }
        }

    }

}
