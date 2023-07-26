import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(new Component("pinicilin", "0.5mg", 15))
                .addComponent(new Component("water", "1.2", 4));
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("pinicilin", "0.5mg", 14))
                .addComponent(new Component("water", "1.2", 2));
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("pinicilin", "0.5mg", 24))
                .addComponent(new Component("water", "1.2", 6));
        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("pinicilin", "0.5mg", 24))
                .addComponent(new Component("water", "1.2", 6));
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy1);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy3);
        pharmacyList.add(pharmacy4);
        System.out.println(pharmacyList);
        System.out.println("-------");
        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);

        // while(pharmacy.hasNext()) {
        // System.out.println(pharmacy.next());
        // }
        // for (Component item : pharmacy1) {
        // System.out.println(item);

        // }
        // System.out.println(pharmacy3.equals(pharmacy4));
        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        System.out.println(result.size());

    }

}