package list集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo04 {
    //目标：掌握Map集合的遍历方式二：键值对
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("嫦娥",20);
        map.put("女儿国王",31);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫薇",31);
        System.out.println(map);//{紫薇=31, 嫦娥=28, 铁扇公主=38, 女儿国王=31}

       //1.把Map集合转换成Set集合，里面的元素类型都是键值对类型（Map.Entry<String,Integer>)
        Set<Map.Entry<String, Integer>> entries = map.entrySet();//这里输入map.entrySet().var按回车
        for (Map.Entry<String, Integer> entry : entries) {//这里输入entries.for按回车
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"=>"+value);
        }
    }
}
