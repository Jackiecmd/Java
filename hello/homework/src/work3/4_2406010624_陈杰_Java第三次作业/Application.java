package work3.work4;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        renderShape(circle);
        renderShape(rectangle);
    }

    public static void renderShape(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.render();
        } else {//在 else 分支里，直接调用 shape.render() 方法。由于 shape 引用的实际对象是 Rectangle 类型，根据多态的特性，运行时会调用 Rectangle 类重写的 render 方法，从而输出 "Rendering Rectangle"
            shape.render();
        }
    }
}
