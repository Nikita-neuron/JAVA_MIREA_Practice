package practice_3;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(10, 12, 2, 3);
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(12, 12, 2, 3, 4);
        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(12, 12, 10, 10, 1, 1);
        System.out.println(r1);
        r1.moveRight();
        System.out.println(r1);
    }
}
