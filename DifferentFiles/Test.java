package DifferentFiles;

public class Test {
    public static void main (String[] args) {
        Book b1 = new Book();
        b1.read("Java Programing");
        Book b2 = new Ebook();
        b2.read("http://ebook.com/ebook");
    }
}