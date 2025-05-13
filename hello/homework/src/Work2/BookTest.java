package Work2;

/**
 * BookTest 类用于测试 Book 类的各种功能
 */
public class BookTest {
    public static void main(String[] args) {
        // 测试1：使用无参构造方法创建图书
        System.out.println("===== 测试1：默认图书 =====");
        Book book1 = new Book();
        System.out.println(book1);

        // 测试2：使用全参构造方法创建图书
        System.out.println("\n===== 测试2：自定义图书（正常价格） =====");
        Book book2 = new Book("Java编程思想", "Bruce Eckel", 99.50);
        System.out.println(book2);

        // 测试3：尝试创建非法价格的图书
        System.out.println("\n===== 测试3：自定义图书（非法价格） =====");
        try {
            Book book3 = new Book("Python入门", "Guido van Rossum", -50.0);
            System.out.println(book3);
        } catch (IllegalArgumentException e) {
            System.out.println("创建图书失败: " + e.getMessage());
        }

        // 测试4：使用setter修改属性
        System.out.println("\n===== 测试4：使用setter方法 =====");
        book1.setTitle("Effective Java");
        book1.setAuthor("Joshua Bloch");
        try {
            book1.setPrice(89.90);  // 正常设置
            System.out.println("修改后的图书1: " + book1);

            book1.setPrice(0.0);     // 非法设置
        } catch (IllegalArgumentException e) {
            System.out.println("修改价格失败: " + e.getMessage());
            System.out.println("当前价格保持为: " + book1.getPrice());
        }

        // 测试5：使用getter获取属性
        System.out.println("\n===== 测试5：使用getter方法 =====");
        System.out.println("图书2的详细信息：");
        System.out.println("书名: " + book2.getTitle());
        System.out.println("作者: " + book2.getAuthor());
        System.out.println("价格: " + book2.getPrice() + "元");

        // 最终图书状态
        System.out.println("\n===== 最终图书状态 =====");
        System.out.println(book1);
        System.out.println(book2);
    }
}
