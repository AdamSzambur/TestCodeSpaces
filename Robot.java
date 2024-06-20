public class Robot{
    private String name;
    private String description;

    public Robot(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}