package Thread_Kuangshen;
//静态代理模式总结：
//1.真实对象和代理对象实现相同的接口
//2.代理对象完成真实对象功能，且附加自己的功能

//好处：
//1.代理对象可以做很多真实对象做不了的事情
//2.真实对象专注做自己的事情
public class StacticProxy {
    public static void main(String[] args) {

        new Thread(()-> System.out.println("我爱你")).start();

        new WeddingCompamy(new You()).HappyMarry();//与下面两行代码等价
       /* WeddingCompamy weddingCompamy=new WeddingCompamy(new You());
        weddingCompamy.HappyMarry();*/
    }
}

interface Marry{
    //人间四大喜事
    //久旱逢甘露
    //他乡遇故知
    //洞房花烛夜
    //金榜题名时
    void HappyMarry();
}

//真实角色
class You implements Marry{
    @Override
    public void HappyMarry(){
        System.out.println("我要结婚了很开心");
    }
}

//代理角色，帮助你结婚
class WeddingCompamy implements Marry{
    private Marry target;
    public WeddingCompamy(Marry target){
        this.target = target;
    }
    @Override
    public void HappyMarry() {
        before();//结婚之前
        this.target.HappyMarry();
        after();
    }
    public void before(){
        System.out.println("结婚之前，布置现场");
    }

    public void after(){
        System.out.println("结婚之后，收尾款");
    }
}