package Test4;

// Book类，用于表示书籍
class Book {
    private String title; // 书名
    private String author; // 作者
    private int quantity; // 库存数量

    // 构造函数，用于初始化书籍对象
    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    // 获取书名
    public String getTitle() {
        return title;
    }

    // 获取作者
    public String getAuthor() {
        return author;
    }

    // 获取库存数量
    public int getQuantity() {
        return quantity;
    }

    // 设置库存数量
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
