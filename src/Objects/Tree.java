package Objects;

import Utility.Objects;
import Utility.Size;

public class Tree extends Objects {
    final boolean flowering;
    final Size size;
    final String smell;

    public Tree(String name) {
        super (name);
        this.size = Size.MIDDLE;
        this.flowering=false;
        smell ="слабый";
    }

    public Tree(String name, Size size, boolean flowering){
        super (name);
        this.size=size;
        this.flowering=flowering;
        if (flowering){
            smell ="острый";
        }
        else {
            smell ="слабый";
        }
    }

    @Override
    public String toString() {
        return "Дерево " + getName() +":"+
                " цветение = " + flowering +
                ", размер = " + size.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return hashCode()==tree.hashCode() && size == tree.size && flowering==tree.flowering;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
