package list集合;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
    public static void main(String[] args) {
        //目标：认识Set家族集合的特点
        //1.创建一个Set集合
        Set<String> set =new HashSet<>();//一行经典代码
        set.add("java");
        set.add("java");
        set.add("harmony");
        set.add("harmony");
        set.add("电商设计");
        set.add("电商设计");
        set.add("新媒体");
        set.add("新媒体");
        set.add("大数据");
        set.add("大数据");
        System.out.println(set);//[harmony, java, 新媒体, 电商设计, 大数据](不重复、无序、无索引）
        //无索引：没有get(1)
        
        //LinkedHashSet:有序、不重复、无索引
        Set<String> set1=new LinkedHashSet<>();
        set1.add("java");
        set1.add("java");
        set1.add("harmony");
        set1.add("harmony");
        set1.add("电商设计");
        set1.add("电商设计");
        set1.add("新媒体");
        set1.add("新媒体");
        set1.add("大数据");
        System.out.println(set1);//[java, harmony, 电商设计, 新媒体, 大数据]

        //2.创建一个TreeSet集合：排序（默认一定要大小升序排序），不重复，无索引
        Set<Double> set2=new TreeSet<>();
        set2.add(3.14);
        set2.add(5.6);
        set2.add(1.0);
        set2.add(1.0);
        set2.add(2.0);
        System.out.println(set2);//[1.0, 2.0, 3.14, 5.6]  排序，不重复，无索引

        System.out.println("===============");
        String s1="acd";
        String s2="abc";
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());
    }
}
