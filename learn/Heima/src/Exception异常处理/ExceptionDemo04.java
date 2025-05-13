package Exception异常处理;
//自定义运行时异常

public class ExceptionDemo04 {
    public static void main(String[] args) {
        //目标：自定义异常
        System.out.println("程序开始");
        /*try {*/
            saveAge(300);
        /*} catch (AgeIllegalRuntimeException e) {
            e.printStackTrace();
        }*///这些在运行时异常中也可以不要
        System.out.println("程序结束");
    }
    //需求：公司收到年龄小于1岁或大于200岁就是一个年龄非法异常
    public static void saveAge(int age) /*throws AgeIllegalRuntimeException//运行时异常可以不写这个，编译器默认有 */{
        if(age<1||age>200){
            //年龄非法：抛出去一个异常返回
            throw new AgeIllegalRuntimeException("年龄非法 age有误");
        }else{
            System.out.println("年龄合法");
            System.out.println("保存年龄"+age);
        }
    }
}
