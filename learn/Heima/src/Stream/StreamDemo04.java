package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static void main(String[] args) {
        //目标：掌握Stream流的统计、收集操作（终结方法）

        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周知只");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");
        list.add("张翠山");
        //收集到集合或者数组中去
        Stream<String> s1=list.stream().filter(s->s.startsWith("张"));
        //收集到List集合
        Stream<String> s2=list.stream().filter(s->s.startsWith("张"));
        List<String> list1=s1.collect(Collectors.toList());
        //收集到Set集合
        Set<String> set=s2.collect(Collectors.toSet());//报错：流已经用完/关闭了
        System.out.println(set);
        //收集到数组
        Stream<String> s3=list.stream().filter(s->s.startsWith("张"));
        Object[] array=s3.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //另一种遍历方式：
        System.out.println(Arrays.toString(array));

        System.out.println("--------------收集到Map集合---------------------");
//以下是调教大模型

    }
}
