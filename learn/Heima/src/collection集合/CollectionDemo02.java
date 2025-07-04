package collection集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        //目标：搞清楚Collection提供的通用集合功能
        Collection<String> list=new ArrayList<>();//多态的体现

        //添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        //获取集合的元素个数
        System.out.println(list.size());

        //删除集合元素
        list.remove("李四");
        System.out.println(list);

        //判断集合是否为空
        System.out.println(list.isEmpty());//false

        //清空集合
        //list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

        //判断集合中是否存在某个数据
        System.out.println(list.contains("张三"));//如果清空了肯定没有。

        //把集合转换成数组
        Object[] arr=list.toArray();
        System.out.println(Arrays.toString(arr));
        for (Object o : arr) {
            System.out.print(o );
        }

        String[] arr2=list.toArray(String[]::new);
        for (String s : arr2) {
            System.out.print(s );
        }
    }
}
