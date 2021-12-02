package Objects;

import Utility.Size;
import Utility.Status;
import Utility.StoryCharacters;

public class Bear extends StoryCharacters { //Эмма
    public Bear(String name) {
        super(name, Status.NORMAL,Size.MIDDLE);
        }
    public Bear(String name, Status status, Size size) {
        super(name, status, size);
        }
    public void intimidation(StoryCharacters characters){
        if (getStatus()==Status.TERRIBLE){
            characters.setStatus(Status.FEAR);
            System.out.println(characters.getName()+" стал "+ characters.getStatusName()+" увидев "+getName());
        }
        else {
            System.out.println(getName()+" "+getStatusName()+", и не кого не обидит");
        }
    }
    @Override
    public String toString() {
        return "Медведь " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bear b = (Bear) o;
        return hashCode()==b.hashCode() && getSize() == b.getSize();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
