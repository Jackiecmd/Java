package collection集合;
//Collection的遍历方式之二：增强for循环

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTraversalDemo04 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式之一：增强for循环
        Collection<String> names = new ArrayList<>();
        names.add("王者");
        names.add("蛋仔");
        names.add("飞车");
        names.add("球球大作战");
        System.out.println(names);//[王者, 蛋仔, 飞车, 球球大作战]

        for(String name : names){//names.for
            System.out.println(name);
        }
    }
}
