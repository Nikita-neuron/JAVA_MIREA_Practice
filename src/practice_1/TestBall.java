package practice_1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("volleyball", 20);
        Ball b2 = new Ball("basketball");

        b2.setDiameter(5);

        System.out.println(b1);
        System.out.println(b2);
    }
}
