package Objects;

import Utility.Insects;
import Utility.Size;
import Utility.Status;

public class Spider extends Insects {
    boolean venom;
    public Spider(String name, int numberOfLegs) {
        super(name,numberOfLegs,Size.SMALL,Status.NORMAL);
    }
    public Spider(String name, int number_of_legs, Size size, Status status){
        super(name,number_of_legs,size,status);
        this.venom=false;
    }
    public Spider(String name,int number_of_legs, Size size, Status status, boolean venom){
        super(name,number_of_legs, size, status);
        this.venom=venom;
    }
    @Override
    public String toString() {
        return "Медведь " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName() +
                ", ядовитость =  " + venom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spider b = (Spider) o;
        return hashCode()==b.hashCode() && getSize() == b.getSize() && venom == b.venom;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
