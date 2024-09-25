package Chapter09.Human;

import Chapter09.Day.Day;

public class Human {
    private String name;
    private int height;
    private int weight;
    private Day birthday;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Human(String name, int height, int weight, Day birthday) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = new Day(birthday);
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

    Day getBirthday() { return new Day(birthday); }

    void gainWeight(int w) {
        weight += w;
    }

    void loseWeight(int w) {
        weight -= w;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }
}
