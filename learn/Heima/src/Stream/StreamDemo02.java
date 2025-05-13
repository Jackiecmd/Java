package Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        //目标：获取Stream流的方式
        //1.获取集合的Stream流：调用集合提供的stream（）方法
        Collection<String> list=new ArrayList<>();
        Stream<String> s1=list.stream();

        //2.Map集合，怎么拿Stream
        Map<String,Integer> map=new HashMap<>();
        //获取键值
        Stream<String> s2 = map.keySet().stream();//map.keySet().stream().var按回车//键流是set集合
        //获取值流
        Stream<Integer> s3=map.values().stream();//值流是collection集合
        //获取键值对流
        Stream<Map.Entry<String,Integer>> s4=map.entrySet().stream();

        //3.获取数组的流
        String[]names={"张三丰","张无忌","张翠山","张良","张学友"};
        Stream<String> s5= Arrays.stream(names);
        System.out.println("s5.count() = " + s5.count());//输入s5.count.sout按回车
    }
}
