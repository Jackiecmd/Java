package com.exception;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {//try监控区

            /*if(b==0){//主动抛出异常  throw throws
                throw new ArithmeticException();//主动的抛出异常，一般在方法中使用
            }注释掉：因为放到31行的方法里去了*/

            new Demo01().test(1, 2);//到这里已经听不懂了（狂神第78集）

            System.out.println(a / b);
            System.out.println("执行了吗");//不会输出
        }/*catch(ArithmeticException e){//catch捕获异常括号中的参数是想要捕获的异常类型，最高的是Throwable
            System.out.println("程序出现异常，变量b不能为0：ArithmeticException");
        }*/ catch (Error e) {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t) {
            System.out.println("Throwable");
        } finally {//处理善后工作（可以省略）
            System.out.println("finally");
        }
        //多个catch类似于if的多个，第一个执行之后后面的就不会执行了，所以要把小的放在前面。不然会报错（被覆盖）
        //即：假设要捕获多个异常：从小到大！！！！！
        //System.out.println(a/b);被除数不能为0

    }

        public void test(int a,int b){
            if(b==0){//主动抛出异常  throw throws
                throw new ArithmeticException();//主动的抛出异常
            }
            System.out.println(a/b);
        }


}
