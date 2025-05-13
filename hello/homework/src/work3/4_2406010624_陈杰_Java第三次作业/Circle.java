package work3.work4;

public class Circle implements Shape{
    public void applyAntiAliasing(){
        System.out.println("Applying anti-aliasing for circle");
    }

    @Override
    public void render() {
        applyAntiAliasing();
        System.out.println("Renddering Circle");
    }
}
