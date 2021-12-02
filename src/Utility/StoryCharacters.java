package Utility;

public abstract class StoryCharacters extends Objects {
    private Status status;
    private final Size size;
    public StoryCharacters(String name,Status status, Size size){
        super (name);
        this.status=status;
        this.size=size;
    }


    public Status getStatus() {
        return status;
    }
    public String getStatusName(){
        return status.getName();
    }
    public void setStatus(Status status){
        this.status=status;
    }

    public Size getSize() {
        return size;
    }
    public String getSizeName(){
        return size.getName();
     }
    public void attach(String move , Objects what, Objects attachTo){
        System.out.println(getName()+" "+move+" "+ what.getName() +" к "+ attachTo.getName());
    }
    public void attach(String move , String what, String attachTo){
        System.out.println(getName()+" "+move+" "+ what +" "+ attachTo);
    }
}
