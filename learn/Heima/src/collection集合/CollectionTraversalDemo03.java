package collection集合;
//Collection的遍历方式之一：迭代器遍历

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo03 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式之一：迭代器遍历
        Collection<String> names=new ArrayList<>();
        names.add("王者");
        names.add("蛋仔");
        names.add("飞车");
        names.add("球球大作战");
        System.out.println(names);//[王者, 蛋仔, 飞车, 球球大作战]

        //1.得到这个集合的迭代器对象(迭代器从索引0，即第一个位置开始)
        Iterator<String> it = names.iterator();  //这里是输入names.iterator().var按回车//这里的迭代器变量是it
        /*System.out.println(it.next());//这里输入it.next().sout按回车
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        //System.out.println(it.next());//多了，会出现异常:NoSuchElementException
        */

        //2.使用一个while循环来遍历
        while(it.hasNext()){//判断的是当前的位置有没有数据，而不是问下一个位置有没有数据
            String name=it.next();
            System.out.println(name);
        }

    }
}
