package String;

public class String_prac3 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        String str=arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
        //当代码执行到这里表示什么？
        //表示数组不是null，也不是长度为0的
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            //i:索引    arr[i]:数组中的元素
            if(i==arr.length-1){
                result=result+arr[i];
            }else {
                result = result + arr[i] + ", ";
            }
        }
        result=result+"]";
        return result;
    }
}
