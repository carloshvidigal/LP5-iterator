package iterator;

public class Player {

    private String name;
    private boolean eligible;

    public Player(String name, boolean eligible) {
        this.name = name;
        this.eligible = eligible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }
}
