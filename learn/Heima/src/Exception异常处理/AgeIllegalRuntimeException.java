package Exception异常处理;

/**
 * 自定义运行时异常
 * 1.继承RuntimeException做爸爸
 * 2.重写RuntimeException的构造器
 * 3.哪里需要用这个异常返回，哪里就throw
 */

    public class AgeIllegalRuntimeException extends RuntimeException{
        public AgeIllegalRuntimeException(){

        }

        public AgeIllegalRuntimeException(String message){
            super(message);
        }
    }

