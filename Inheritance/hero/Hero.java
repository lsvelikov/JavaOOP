package OOP.Inheritance.hero;

public class Hero {
    private String username;
    private int level;

    public Hero(String userName, int level) {
        this.username = userName;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }

}
