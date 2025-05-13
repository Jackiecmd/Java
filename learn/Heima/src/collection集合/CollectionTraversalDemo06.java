package collection集合;
//三种遍历的区别

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTraversalDemo06 {
    public static void main(String[] args) {
        //目标：认识并发修改异常问题，搞清楚每种遍历的区别
        ArrayList<String> list=new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);//[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子, 西洋参]

        //需求1：删除全部枸杞
        for (int i = 0; i < list.size(); i++) {
            String name= list.get(i);
            if(name.contains("枸杞")){
                list.remove(name);
            }
        }
        System.out.println(list);//[Java入门, 黑枸杞, 人字拖, 枸杞子, 西洋参]
        // 没有删干净：出现了并发修改异常的问题（遍历的同时出现增删可能导致异常）
        //原因：删掉之后后面的移到了该下标，但是该下标会变大，会漏掉这个

        //这里copy一份上面写的，并使用list2加以区分（重命名可以用shift+f4统一修改）

        //解决方案1：删除数据后做一步i--操作
        System.out.println("==========");
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        list2.add("西洋参");
        System.out.println(list2);
        //需求1：删除全部枸杞
        for (int i = 0; i < list2.size(); i++) {
            String name= list2.get(i);
            if(name.contains("枸杞")){
                list2.remove(name);
                i--;
            }
        }
        System.out.println(list2);


        //解决方案2：倒着遍历并删除（前提是支持索引）
        System.out.println("==========");
        ArrayList<String> list3=new ArrayList<>();
        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特级枸杞");
        list3.add("枸杞子");
        list3.add("西洋参");
        System.out.println(list3);
        //需求1：删除全部枸杞
        for (int i = list3.size()-1; i >=0; i--) {
            String name= list3.get(i);
            if(name.contains("枸杞")){
                list3.remove(name);//删掉后，当前索引会被会被顺序上后面的元素补充，再次进行判断，然后往前走
            }
        }
        System.out.println(list3);

        //方案一：迭代器遍历并删除（默认也存在并发修改异常问题）
        //可以解决：使用迭代器自己的方法来删除
        System.out.println("==========");
        ArrayList<String> list4=new ArrayList<>();
        list4.add("Java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("特级枸杞");
        list4.add("枸杞子");
        list4.add("西洋参");
        System.out.println(list4);

        Iterator<String> it=list4.iterator();
        while(it.hasNext()){
            String name=it.next();//异常：ConcurrentModificationException（并发修改异常）（系统知道会出现这种bug所以抛出了异常）
            if(name.contains("枸杞")){
                //list4.remove(name);//这样做会有异常
                it.remove();//这样就能解决（底层是记了索引的）
            }
        }
        System.out.println(list4);

        //方案二和方案三：用增强for还有lambda（都没有办法解决修改异常问题）
        System.out.println("==========");
        ArrayList<String> list5=new ArrayList<>();
        list5.add("Java入门");
        list5.add("宁夏枸杞");
        list5.add("黑枸杞");
        list5.add("人字拖");
        list5.add("特级枸杞");
        list5.add("枸杞子");
        list5.add("西洋参");
        System.out.println(list5);

        for (String s : list5) {//输入list.for然后回车
            if(s.contains("枸杞")){
                list5.remove(s);
            }
        }
        //增强for循环底层就是迭代器，但是却拿不到迭代器变量
        System.out.println(list5);//ConcurrentModificationException
    }
}

/**
 * 结论：增强for和lambda只适合做遍历，不适合做遍历并修改操作
 */
