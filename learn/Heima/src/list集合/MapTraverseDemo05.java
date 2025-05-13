package list集合;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTraverseDemo05 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式三：Lambda
        Map<String,Integer> map1=new LinkedHashMap<>();
        map1.put("嫦娥",20);
        map1.put("女儿国王",31);
        System.out.println(map1.put("嫦娥",28));//返回值为20（被覆盖的数据）
        map1.put("铁扇公主",38);
        map1.put("紫薇",31);

        //1.直接调用Map集合的forEach方法完成遍历
        map1.forEach(new BiConsumer<String, Integer>() {//这里输入map1.forEach(new BiConsumer<String, Integer>()回车即可
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+"="+value);
            }
        });
    }
}
