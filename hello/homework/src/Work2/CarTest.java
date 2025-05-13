package Work2;

    /**
     * CarTest 类用于测试 Car 类的各种功能
     */
    public class CarTest {
        public static void main(String[] args) {
            // 测试1：使用无参构造方法
            System.out.println("===== 测试1：默认汽车 =====");
            Car car1 = new Car();
            car1.showCarInfo();

            // 测试2：使用全参构造方法（正常价格）
            System.out.println("\n===== 测试2：自定义汽车（正常价格） =====");
            Car car2 = new Car("丰田", "凯美瑞", "白色", 219800);
            System.out.println(car2); // 调用toString()

            // 测试3：使用全参构造方法（非法价格）
            System.out.println("\n===== 测试3：自定义汽车（非法价格） =====");
            try {
                Car car3 = new Car("奔驰", "S级", "黑色", 600000);
                car3.showCarInfo();
            } catch (IllegalArgumentException e) {
                System.out.println("创建汽车失败: " + e.getMessage());
            }

            // 测试4：使用setter方法修改属性
            System.out.println("\n===== 测试4：修改汽车属性 =====");
            car1.setBrand("本田");
            car1.setModel("雅阁");
            car1.setColor("蓝色");
            try {
                car1.setPrice(189800);
                car1.showCarInfo();

                System.out.println("\n尝试设置非法价格:");
                car1.setPrice(40000);
            } catch (IllegalArgumentException e) {
                System.out.println("修改价格失败: " + e.getMessage());
                System.out.println("当前价格保持为: " + car1.getPrice() + "元");
            }

            // 测试5：使用getter方法获取属性
            System.out.println("\n===== 测试5：获取汽车属性 =====");
            System.out.println("car2的详细信息:");
            System.out.println("品牌: " + car2.getBrand());
            System.out.println("型号: " + car2.getModel());
            System.out.println("颜色: " + car2.getColor());
            System.out.printf("价格: %.2f元%n", car2.getPrice());
        }
    }

