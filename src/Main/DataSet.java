package Main;

import java.util.HashSet;
import java.util.*;

public class DataSet {

    // jika kita mendeclarasi array menggunakan Set ,
    // jika ada value yg sama ,
    // maka hanya satu yg disimpan kedalam data Set tsb

    public static void main(String[] args) {
        // HashSet
        Set<String> car = new HashSet<>();
        car.add("Buroq");
        car.add("Ferari");
        car.add("Ferari");
        car.add("Ferari");
        car.add("Lamborgini");

        System.out.println("Jumlah Set car ada :" + car.size());
        System.out.println(" Looping menggunakan for ");
        for (String c : car) {
            if (c.equals("Buroq")) {
                car.remove(c);
                System.out.println("Menghapus buroq dari data Set");
                continue;
            }
            System.out.println("\t" + c);
        }

        System.out.println("---------------------------------");

        System.out.println("Jumlah Set car ada :" + car.size());
        System.out.println(" Looping menggunakan Iterator ");
        for (Iterator iterator = car.iterator(); iterator.hasNext(); ) {
            System.out.println("\t" + iterator.next());
        }
    }
}
