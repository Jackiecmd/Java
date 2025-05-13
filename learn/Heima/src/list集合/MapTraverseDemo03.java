package list集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo03 {
    //目标：掌握Map集合的遍历方式一：键找值
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("嫦娥",20);
        map.put("女儿国王",31);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫薇",31);
        System.out.println(map);//{紫薇=31, 嫦娥=28, 铁扇公主=38, 女儿国王=31}

        //1.提起Map集合的全部键到一个Set集合中去
        Set<String> keys=map.keySet();
        System.out.println(keys);

        //2.遍历Set集合，得到每一个键
        for (String key : keys) {
            //3.根据键去找值
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
