package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataList {

    public static void main(String[] args) {
//      ----- mendeklarasi array menggunakan default -----
        String[] car = new String[2];
        car[0] = "Ferari";
        car[1] = "McLarren";

        System.out.println(" Ini Menggunakan Array Default ");
        System.out.println("\t" + Arrays.toString(car));

//      ----- mendeklarasi array menggunakan ArrayList ------

        java.util.List<String> newCar = new ArrayList<>();
        newCar.add("Ferari");
        newCar.add("McLarren");

        System.out.println(" Ini Menggunakan ArrayList ");
        for (int i = 0; i < newCar.size(); i++) {
            System.out.println("\t index :" + i + " = " + newCar.get(i));
        }
    }
}
