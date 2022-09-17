package practice_1;

public class Ball {
    private String type;
    private int diameter;

    public Ball(String type, int diameter) {
        this.type = type;
        this.diameter = diameter;
    }

    public Ball(String type) {
        this.type = type;
        this.diameter = 0;
    }

    public Ball() {
        this.type = "football";
        this.diameter = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
