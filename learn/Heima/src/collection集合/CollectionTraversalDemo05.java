package collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTraversalDemo05 {
    public static void main(String[] args) {
        //掌握Collection的遍历方法之三：lambda（λ）
        Collection<String> names = new ArrayList<>();
        names.add("王者");
        names.add("蛋仔");
        names.add("飞车");
        names.add("球球大作战");
        System.out.println(names);//[王者, 蛋仔, 飞车, 球球大作战]

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
