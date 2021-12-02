package Objects;

import Utility.Huntable;
import Utility.Size;
import Utility.Status;
import Utility.StoryCharacters;

public class Birds extends StoryCharacters implements Huntable {
    private int numberOfBirds;
    private String place;

    public Birds(String name) {
        super(name, Status.NORMAL, Size.MIDDLE);
    }

    public Birds(String name, int numberOfBirds) {
        super(name, Status.NORMAL, Size.MIDDLE);
        this.numberOfBirds = numberOfBirds;
    }

    public Birds(String name, int numberOfBirds, Status status, Size size) {
        super(name, status, size);
        this.numberOfBirds = numberOfBirds;
    }

    public void fly(String place) {
        this.place = place;
        System.out.println(getName()+" в воздухе");
    }
    @Override
    public void hunt(StoryCharacters characters) {
        if (numberOfBirds > 0 && place != null) {
            if (numberOfBirds == 1) {
                System.out.println(getSizeName() + " "+getStatusName() + " "+getName() + " порхает " + place + ", охотясь на " + characters.getSizeName() + " " + characters.getName() + ".");
            } else {
                System.out.println(numberOfBirds + " " + getName() + " порхают " + place + ", охотясь на " + characters.getSizeName() + " " + characters.getName() + ".");
            }
        } else if (numberOfBirds > 0) {
            System.out.println(numberOfBirds + " " + getName() + " сидят, не обращая внимания на " + characters.getSizeName() + " " + characters.getName() + ".");
        } else {
            System.out.println(getName() + " нет, " + characters.getSizeName() + " " + characters.getName() + " в безопасности.");
        }
    }
    @Override
    public String toString() {
        return "Птица " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName()+
                ", количество = " + numberOfBirds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds b = (Birds) o;
        return hashCode()==b.hashCode() && getSize() == b.getSize() && numberOfBirds==b.numberOfBirds;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}