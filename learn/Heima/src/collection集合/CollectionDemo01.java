package collection集合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //目标：搞清楚Collection集合的整体特点
        //1.List家族的集合：有序、可重复、有索引
        List<String> list=new ArrayList<>();//多态的体现
        list.add("Java");
        list.add("Java");
        list.add("C");
        list.add("C++");
        System.out.println(list);//可重复，有序（顺序和添加顺序一样）
        String rs=list.get(0);
        System.out.println(rs);

        //2.Set家族的集合：无序、不可重复、无索引
        Set<String> set=new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("homony");
        set.add("apple");
        System.out.println(set);//无序不重复
    }
}
