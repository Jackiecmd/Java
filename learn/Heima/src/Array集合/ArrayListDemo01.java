package Array集合;
//集合

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合的对象
        //泛型：限定集合中存储的数据的类型
        //ArrayList<int> list =new ArrayList<>int();//编译报错：集合里不能直接存基本数据类型
        ArrayList<String> list1 =new ArrayList<String>();
        //JDK7:
        ArrayList<String> list =new ArrayList<>();

        //此时创建的是ArrayList的对象，而ArrayList是java已经写好的类
        //这个类在底层做了一些处理：打印对象不是地址值，而是集合中存储数据内容
        //在展示的时候会拿[]把所有的数据进行包裹
        System.out.println(list);//[]


    }
}
