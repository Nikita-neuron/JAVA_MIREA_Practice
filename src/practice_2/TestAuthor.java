package practice_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tom", "tomAuthor@example.com", 'M');

        System.out.println(author);

        author.setEmail("tom@example.com");

        System.out.println(author);
    }
}
