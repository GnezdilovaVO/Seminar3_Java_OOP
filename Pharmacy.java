import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Comparator<Pharmacy> {
    private List<Component> components;

    public Pharmacy() {
        this.components = new ArrayList<>();
    }

    public List<Component> getComponents() {
        return components;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s Компоненты: %s, сила: %s",
                getClass().getSimpleName(), this.components, this.getPharmacePower());
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    // @Override
    // public Iterator<Component> iterator() {
    // return new Iterator<>() {

    // @Override
    // public boolean hasNext() {
    // return index < components.size();
    // }

    // @Override
    // public Component next() {
    // // Component component = components.get(index);
    // // index++;
    // // return component;
    // return components.get(index++);
    // }

    // };
    // }
    private int getPharmacePower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public int compareTo(Pharmacy o) {
        // if (o.getPharmacePower() < this.getPharmacePower()) return 10;
        // else if (o.getPharmacePower() > this.getPharmacePower()) return -10;
        // return 0;
        int res = this.getPharmacePower() - o.getPharmacePower();
        if (res != 0) return res;


        res = this.components.size() - o.components.size();
        if (res != 0) return res;

        for (int i = 0; i < this.components.size(); i++) {
            res = this.components.get(i).getName().compareTo(o.components.get(i).getName());
            if (res != 0) return res;
        }
        return 0;
    }

    @Override
    public int compare(Pharmacy o1, Pharmacy o2) {
        // return o1.compareTo(o2);
        if (o1.getPharmacePower() > o2.getPharmacePower())
            return 10;
        else if (o1.getPharmacePower() < o2.getPharmacePower())
            return -10;
        return 0;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((components == null) ? 0 : components.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pharmacy other = (Pharmacy) obj;
        if (components == null) {
            if (other.components != null)
                return false;
        } else if (!components.equals(other.components))
            return false;
        return true;
    }

}
