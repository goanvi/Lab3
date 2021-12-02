package Objects;

import Utility.Movable;
import Utility.Objects;

public class House extends Objects implements Movable {
    boolean full=false;
    public House(String name){
        super (name);
    }
    public void fillIn(Tree tree) {
        full=true;
        if (tree.flowering) {
            System.out.println("Вечером " + tree.smell + " запах цветущего дерева " + tree.getName() +" "+ tree.size.getName()+" размера заполнил " + getName());
        } else {
            System.out.println("Вечером " + tree.smell + " запах дерева" + tree.getName() + "еле чувствовался в" + getName());
        }
    }
    @Override
    public String move(String movement, String place){
        return getName() +" "+movement+" "+place;
    }

    @Override
    public void move(String movement, Objects objects) {
    }
    @Override
    public String toString() {
        return "Дом " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House b = (House) o;
        return hashCode()==b.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
