package Work2;

/**
 * Book 类表示图书信息，包含书名、作者和价格
 */
public class Book {
    // 私有属性
    private String title;   // 书名
    private String author;  // 作者
    private double price;   // 价格

    /**
     * 无参构造方法 - 创建默认图书对象
     * 默认书名："未命名图书"
     * 默认作者："未知作者"
     * 默认价格：0.0
     */
    public Book() {
        this.title = "未命名图书";
        this.author = "未知作者";
        this.price = 0.0;
    }

    /**
     * 全参构造方法 - 使用指定属性创建图书对象
     * @param title 书名
     * @param author 作者
     * @param price 价格
     * @throws IllegalArgumentException 如果价格不合法
     */
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // 通过setter方法设置价格以进行验证
    }

    // ============== Getter方法 ==============

    /**
     * 获取书名
     * @return 书名
     */
    public String getTitle() {
        return title;
    }

    /**
     * 获取作者
     * @return 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 获取价格
     * @return 价格
     */
    public double getPrice() {
        return price;
    }

    // ============== Setter方法 ==============

    /**
     * 设置书名
     * @param title 新书名
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 设置作者
     * @param author 新作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 设置价格
     * @param price 新价格
     * @throws IllegalArgumentException 如果价格不合法（<=0）
     */
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("价格必须大于0");
        }
        this.price = price;
    }

    /**
     * 重写toString方法，返回图书信息
     * @return 格式化的图书信息字符串
     */
    @Override
    public String toString() {
        return String.format("《%s》- 作者：%s，价格：%.2f元",
                title, author, price);
    }
}
