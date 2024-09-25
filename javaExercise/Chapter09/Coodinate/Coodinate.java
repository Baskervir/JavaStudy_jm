package Chapter09.Coodinate;

public class Coodinate {
    private double x;
    private double y;

    public Coodinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    void set(double x, double y) { this.x = x; this.y = y; }
}
