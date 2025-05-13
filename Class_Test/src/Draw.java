public class Draw {
    // 定义一个名为 Draw 的类，用于绘制不同的图形
        // 定义一个私有成员变量 count，用于存储每行星号的数量
        private int count;
        // 定义一个私有成员变量 lines，用于存储图形的行数
        private int lines;

        /**
         * 构造方法，用于初始化 Draw 类的对象
         * @param count 每行星号的数量
         * @param lines 图形的行数
         */
        public Draw(int count, int lines) {
            // 将传入的 count 参数赋值给类的成员变量 count
            this.count = count;
            // 将传入的 lines 参数赋值给类的成员变量 lines
            this.lines = lines;
        }

        /**
         * 绘制直角三角形的方法
         * 直角三角形的特点是每一行的星号数量随着行数的增加而增加
         */
        public void drawTrian() {
            // 外层循环控制行数，从第 1 行开始，直到达到指定的行数 lines
            for (int i = 1; i <= lines; i++) {
                // 内层循环控制每一行输出的星号数量，其数量等于当前的行数 i
                for (int j = 0; j < i; j++) {
                    // 输出一个星号，不换行
                    System.out.print("*");
                }
                // 每一行的星号输出完毕后，换行，以便开始下一行的输出
                System.out.println();
            }
        }

        /**
         * 绘制矩形的方法
         * 矩形的特点是每一行的星号数量固定，都为 count
         */
        public void drawRec() {
            // 外层循环控制行数，从第 0 行开始，直到达到指定的行数 lines
            for (int i = 0; i < lines; i++) {
                // 内层循环控制每一行输出的星号数量，固定为 count
                for (int j = 0; j < count; j++) {
                    // 输出一个星号，不换行
                    System.out.print("*");
                }
                // 每一行的星号输出完毕后，换行，以便开始下一行的输出
                System.out.println();
            }
        }

        /**
         * 绘制平行四边形的方法
         * 平行四边形的特点是每一行前面有一定数量的空格，空格数量随着行数增加而增加，每一行的星号数量固定为 count
         */
        public void drawPra() {
            // 外层循环控制行数，从第 0 行开始，直到达到指定的行数 lines
            for (int i = 0; i < lines; i++) {
                // 第一个内层循环控制每一行前面的空格数量，空格数量等于当前的行数 i
                for (int j = 0; j < i; j++) {
                    // 输出一个空格，不换行
                    System.out.print(" ");
                }
                // 第二个内层循环控制每一行输出的星号数量，固定为 count
                for (int k = 0; k < count; k++) {
                    // 输出一个星号，不换行
                    System.out.print("*");
                }
                // 每一行的空格和星号输出完毕后，换行，以便开始下一行的输出
                System.out.println();
            }
        }

        /**
         * 程序的入口方法，用于测试 Draw 类的功能
         * @param args 命令行参数，在本程序中未使用
         */
        public static void main(String[] args) {
            // 创建一个 Draw 类的对象，设置每行星号数量为 5，行数为 5
            Draw draw = new Draw(5, 5);
            // 输出提示信息，表示接下来要绘制直角三角形
            System.out.println("直角三角形:");
            // 调用 drawTrian 方法绘制直角三角形
            draw.drawTrian();
            // 输出提示信息，表示接下来要绘制矩形
            System.out.println("矩形:");
            // 调用 drawRec 方法绘制矩形
            draw.drawRec();
            // 输出提示信息，表示接下来要绘制平行四边形
            System.out.println("平行四边形:");
            // 调用 drawPra 方法绘制平行四边形
            draw.drawPra();
        }
}
