package Main;

import java.util.ArrayList;
import java.util.List;
import Mobil.*;

public class DataGeneric {


    public static void main(String[] args) {
        List<Mobil> cars = new ArrayList();
        cars.add(new Mobil("Lamborghini"));
        cars.add(new Mobil("Ferari"));

        System.out.println( cars.toString() );

        System.out.println("-----------------------------------");

        for (Object o : cars) {
            Mobil p = (Mobil) o;
            p.print();
        }
    }
}
