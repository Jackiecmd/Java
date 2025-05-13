package Exception异常处理;
//异常-自定义编译时异常

public class ExceptionDemo03 {
    public static void main(String[] args) {
        //目标：自定义异常
        System.out.println("程序开始");
        try {
            saveAge(300);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
    //需求：公司收到年龄小于1岁或大于200岁就是一个年龄非法异常
    public static void saveAge(int age) throws AgeIllegalException {
        if(age<1||age>200){
            //年龄非法：抛出去一个异常返回
            throw new AgeIllegalException("年龄非法 age有误");
        }else{
            System.out.println("年龄合法");
            System.out.println("保存年龄"+age);
        }
    }
}
