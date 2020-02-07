package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Mobil.Mobil;

public class WildCard {

    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls); // Apakah baris ini valid?

        Collection<Mobil> cp = new ArrayList();
        cp.add(new Mobil("Mercury"));
        cp.add(new Mobil("Venus"));

        print(cp); // Apakah baris ini valid?
    }

    public static void print(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

}
