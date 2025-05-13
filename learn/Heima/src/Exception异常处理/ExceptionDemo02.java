package Exception异常处理;
//异常处理-搞清楚异常的作用

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        try {
            System.out.println(div(10, 0));
            System.out.println("底层方法执行成功了");
        }catch(Exception e){
            e.printStackTrace();//打印异常信息
            System.out.println("底层方法执行失败");
        }
        System.out.println("程序结束执行...");
    }

    //需求：求两个数的除的结果，并返回这个结果
    public static int div(int a,int b)throws Exception{
        if(b==0){
            System.out.println("除数不能为0");
            //return 0;//这样做会输出0，需要一个能让上级知道是执行成功了还是执行失败了的东西
            throw new Exception("除数不能为0");//运行时异常
        }
        int result =a/b;
        return result;
    }
}

/**
 * 异常：代码在编译或运行时可能出现的错误
 * Exception，分为两类：编译时异常、运行时异常
 * 编译时异常：没有继承RunTimeException的异常，编译阶段就会报错
 * 运行时异常：继承自RuntimeException的异常或其子类，编译阶段不报错，运行时出现的
 * 异常的作用：用来找bug：可通过作为内部方法向上返回，通知上层调用者底层的执行情况
 */
