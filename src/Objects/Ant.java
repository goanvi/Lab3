package Objects;

import Utility.Insects;
import Utility.Size;
import Utility.Status;

public class Ant extends Insects {
    public Ant(String name, int numberOfLegs, Size size, Status status){
        super(name, numberOfLegs, size,status);
    }
    public Ant(String name, int numberOfLegs){
        super(name, numberOfLegs, Size.SMALL,Status.NORMAL);
    }
    @Override
    public String toString() {
        return "Муравей " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ant b = (Ant) o;
        return hashCode()==b.hashCode() && getSize() == b.getSize() && getNumberOfLegs()==b.getNumberOfLegs();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
