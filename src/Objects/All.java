package Objects;

import Utility.*;

public class All extends StoryCharacters implements Movable {
    public All(String name){
        super(name,Status.NORMAL, Size.MIDDLE);
    }
    public All(String name,Status status, Size size){
        super(name, status,size);
    }
     public void view(String formView, String action){
         System.out.println(getName()+" "+formView+" "+action);
     }

    public void moralAction (StoryCharacters characters, String move){
        if (getStatus()==Status.FEAR){
            System.out.println("Забыв "+getStatusName()+" состояние перед "+characters.getName()+" "+move);
            setStatus(Status.NORMAL);
        }
    }
    @Override
    public String move(String movement, String place){
        return getName()+" "+movement+" "+place;
    }

    @Override
    public void move(String movement, Objects objects) {
    }
    @Override
    public String toString() {
        return "Все " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        All b = (All) o;
        return hashCode()==b.hashCode() && getSize() == b.getSize();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
