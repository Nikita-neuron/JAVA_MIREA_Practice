package practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Java. Beginner's Guide", "Herbert Schildt");
        Book b2 = new Book("Java. Developer's guide");

        b2.setAuthor("Benjamin J. Evans");

        System.out.println(b1);
        System.out.println(b2);
    }
}
