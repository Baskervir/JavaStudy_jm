package Chapter9.Human;

public class Human {
    private String name;
    private int height;
    private int weight;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    int getHeight() {
        return height;
    }

    int getWeight() {
        return weight;
    }

    void gainWeight(int w) {
        weight += w;
    }

    void loseWeight(int w) {
        weight -= w;
    }
}
