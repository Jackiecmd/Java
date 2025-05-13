package Work2;

/**
 * Car 类表示汽车信息，包含品牌、型号、颜色和价格
 */
public class Car {
    // 私有属性
    private String brand;  // 品牌
    private String model; // 型号
    private String color; // 颜色
    private double price; // 价格（单位：元）

    // 价格范围常量
    private static final double MIN_PRICE = 50000;
    private static final double MAX_PRICE = 500000;

    /**
     * 无参构造方法 - 创建默认汽车对象
     */
    public Car() {
        this.brand = "未知品牌";
        this.model = "未知型号";
        this.color = "未知颜色";
        this.price = 100000; // 默认价格
    }

    /**
     * 全参构造方法 - 使用指定属性创建汽车对象
     * @param brand 品牌
     * @param model 型号
     * @param color 颜色
     * @param price 价格
     * @throws IllegalArgumentException 如果价格不在有效范围内
     */
    public Car(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        setPrice(price); // 通过setter方法设置价格以进行验证
    }

    // ============== Getter方法 ==============

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // ============== Setter方法 ==============

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 设置汽车价格
     * @param price 新价格
     * @throws IllegalArgumentException 如果价格不在50000-500000范围内
     */
    public void setPrice(double price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException(String.format(
                    "价格必须在%.2f到%.2f元之间", MIN_PRICE, MAX_PRICE));
        }
        this.price = price;
    }

    // ============== 其他方法 ==============

    /**
     * 显示汽车完整信息
     */
    public void showCarInfo() {
        System.out.println("===== 汽车信息 =====");
        System.out.println("品牌: " + brand);
        System.out.println("型号: " + model);
        System.out.println("颜色: " + color);
        System.out.printf("价格: %.2f元%n", price);
        System.out.println("=================");
    }

    /**
     * 重写toString方法
     * @return 格式化的汽车信息字符串
     */
    @Override
    public String toString() {
        return String.format("%s %s [颜色:%s, 价格:%.2f元]",
                brand, model, color, price);
    }
}
