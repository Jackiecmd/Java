package Stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        //目标：掌握Stream提供的常用的中间方法，对流上的数据进行处理（返回新流：支持链式编程）
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周知只");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");
        list.add("张翠山");

        //1.过滤方法
        list.stream().filter(s->s.startsWith("张") && s.length() == 3).forEach(s->System.out.println(s));

        //2.排序方法
        List <Double> scores=new ArrayList<>();
        scores.add(99.6);
        scores.add(88.6);
        scores.add(66.6);
        scores.add(66.6);
        scores.add(77.6);
        scores.add(77.6);
        scores.stream().sorted().forEach(System.out::println);//默认为升序//66.6   77.6   88.6   99.6
        System.out.println("-------");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).forEach(System.out::println);//降序
        System.out.println("-------");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).limit(2).forEach(System.out::println);//只要前两名
        System.out.println("-------");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).skip(2).forEach(System.out::println);//跳过前两名
        System.out.println("===");
        //去重
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).distinct().skip(2).forEach(System.out::println);//去重复
        System.out.println("=====");
        //映射/加工方法：把流上原来的数据拿出来变成新数据又放上去了
        scores.stream().distinct().map(s->"加10分后："+(s + 10)).forEach(System.out::println);

        //合并流
        Stream<String> s1=Stream.of("张三丰","张无忌","张翠山","张良","张学友");
        Stream<Integer> s2=Stream.of(111,22,33,44);
        Stream<Object> s3 = Stream.concat(s1, s2);//这里输入Stream.concat(s1,s2).var按回车
        // 这里改为用Object来接，因为既有字符串又有整数。如果两个流一样，比如都是字符串，可以直接用String
        s3.forEach(System.out::println);
        // 注意：流只能被消费一次，上面的forEach已经消费了流，下面的count会报错
        // System.out.println(s3.count()); 本应输出9（9个数据）// 错误：流已经被操作或关闭
    }
}
