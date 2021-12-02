package Utility;

public abstract class Insects extends StoryCharacters{
    private final int numberOfLegs;
    public Insects(String name, int numberOfLegs, Size size, Status status){
        super(name, status, size);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}

