package Test4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java Guide", "Alice", 5));
        lib.addBook(new Book("Python Basics", "Bob", 3));

        System.out.println("Total books: " + lib.totalBooks());

        // 按书名查询
        List<Book> foundByTitle = lib.findBooksByTitle("Java");
        for (Book book : foundByTitle) {
            System.out.println("Found by title: " + book.getTitle());
        }

        // 按作者查询
        List<Book> foundByAuthor = lib.findBooksByAuthor("Bob");
        for (Book book : foundByAuthor) {
            System.out.println("Found by author: " + book.getAuthor());
        }

        // 删除书籍
        lib.removeBook("Python Basics");
        System.out.println("Total books after removal: " + lib.totalBooks());
    }
}
