package Objects;

import Utility.Size;
import Utility.Status;
import Utility.StoryCharacters;

public class Ferrets extends StoryCharacters { //Мю и Муми-папа
    public Ferrets(String name){
        super(name, Status.NORMAL,Size.SMALL);
    }
    public Ferrets(String name, Status status, Size size){
        super(name, status,size);
    }
    public void meet(StoryCharacters characters, House room,String action){
        if (characters.getStatus()==Status.TERRIBLE){
            setStatus(Status.FEAR);
        }
        System.out.println(getSizeName()+" "+getName()+" "+action+" "+room.getName() +" "+characters.getSizeName()+" "+characters.getStatusName()+" "+characters.getName());
    }
    @Override
    public String toString() {
        return "Хорек " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferrets b = (Ferrets) o;
        return hashCode()==b.hashCode() && getSize() == b.getSize();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
