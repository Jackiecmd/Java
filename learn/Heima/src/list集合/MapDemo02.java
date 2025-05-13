package list集合;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        //目标：掌握Map的常用方法：
        Map<String,Integer> map1=new LinkedHashMap<>();
        map1.put("嫦娥",20);
        map1.put("女儿国王",31);
        System.out.println(map1.put("嫦娥",28));//返回值为20（被覆盖的数据）
        map1.put("铁扇公主",38);
        map1.put("紫薇",31);
        map1.put(null,null);
        System.out.println(map1);

        //写代码演示常用方法
        System.out.println(map1.get("嫦娥"));//根据键取值  //28
        System.out.println(map1.get("嫦娥2"));//根据键取值  //null

        System.out.println(map1.containsKey("嫦娥"));//判断是否包含某个键  true
        System.out.println(map1.containsKey("嫦娥2"));//判断是否包含某个键  false

        System.out.println(map1.remove("嫦娥"));//根据键删除键值对  返回值
        System.out.println(map1);

        //map1.clear();//清空map1
        //System.out.println(map1);//{}

        System.out.println(map1.isEmpty());//判断是否为空

        System.out.println(map1.size());//获取键值对的个数  4(成对的算一个)

        //获取所有的键放到一个Set集合返回给我们
        Set<String> keys = map1.keySet();//这里是直接输入map1.keyset().var按回车
        for (String key : keys) {
            System.out.println(key);//跟Set集合特性一样，键不重复，无序，无索引
        }

        //获取所有的值放到一个Collection集合返回给我们
        Collection<Integer> values =map1.values();//值有可能重复，不能放Set集合（Collection是单列集合的顶级父类）
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
