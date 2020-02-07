package Main;

import Mobil.Mobil;
import Mobil.MobilGo;
import Mobil.Car;

import java.util.HashMap;
import java.util.Map;

public class DataMap {

    public static void main(String[] args) {
        Map<String, MobilGo> cars = new HashMap<>();
        cars.put("key-1" , new MobilGo("Ferari"));
        cars.put("key-2" , new MobilGo("Lambo"));
        cars.put("key-3" , new MobilGo("McLaren"));
        cars.put("key-4" , new MobilGo("Galardo"));

        System.out.println(cars.toString());
        System.out.println(" Looping an array Type : Map ");
        for (String key : cars.keySet()) {
            System.out.println("\t Mobil Saya Dengan Kunci : " + key + "|" + cars.get(key));
        }
    }

}
