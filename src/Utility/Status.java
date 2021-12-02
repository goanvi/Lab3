package Utility;

public enum Status {
    FEAR("боязливый"),
    TERRIBLE("страшный"),
    NORMAL("нормальный");
    private final String name;
    Status(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
