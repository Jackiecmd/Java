package list集合;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //目标：认识Map集合的体系特点
        //1.创建Map集合
        //HashMap特点：无序、不重复、无索引，键值对都可以是null，值不做要求（可以重复）
        Map<String,Integer> map=new HashMap<>();//一行经典代码。多态的体现。
        map.put("嫦娥",20);
        map.put("女儿国王",31);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫薇",31);
        map.put(null,null);
        System.out.println(map);//{null=null, 紫薇=31, 嫦娥=28, 铁扇公主=38, 女儿国王=31}（嫦娥28，重复的键会覆盖之前的数据）

        System.out.println("==========");

        //LinkedHashMap特点：有序、不重复、无索引、键值对都可以是null，值不做要求（可以重复）
        //TreeMap：按照键可排序，不重复，无索引，键值对都可以是null，值不做要求（可以重复）
        Map<String,Integer> map1=new LinkedHashMap<>();
        map1.put("嫦娥",20);
        map1.put("女儿国王",31);
        map1.put("嫦娥",28);
        map1.put("铁扇公主",38);
        map1.put("紫薇",31);
        map1.put(null,null);
        System.out.println(map1);//{嫦娥=28, 女儿国王=31, 铁扇公主=38, 紫薇=31, null=null}
    }
}
