package Test4;

import java.util.ArrayList;
import java.util.List;

// Library类，用于管理书籍
class Library {
    private List<Book> books; // 用于存储书籍的列表

    // 构造函数，初始化书籍列表
    public Library() {
        books = new ArrayList<>();
    }

    // 添加书籍的方法
    public void addBook(Book book) {
        books.add(book);
    }

    // 删除书籍的方法，根据书名删除
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    // 按书名查询书籍的方法，返回匹配的书籍列表
    public List<Book> findBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                result.add(book);
            }
        }
        return result;
    }

    // 按作者查询书籍的方法，返回匹配的书籍列表
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // 统计库存总数的方法
    public int totalBooks() {
        int total = 0;
        for (Book book : books) {
            total += book.getQuantity();
        }
        return total;
    }
}
