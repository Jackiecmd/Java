package Array集合;
//ArrayList成员方法

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //2.添加元素
        boolean result1 = list.add("aaa");//add成员方法不管是添加什么都是返回true的
        System.out.println(result1);
        System.out.println(list);
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        System.out.println("==================");

        //3.删除元素
        boolean result=list.remove("aaa");
        System.out.println(result);
        System.out.println(list);
        boolean result2=list.remove("b");//不存在这个元素
        System.out.println(result2);
        System.out.println(list);

        list.add("eee");
        list.add("间隔");
        list.add("eee");
        System.out.println(list);
        list.remove("eee");
        System.out.println(list);

        String str = list.remove(0);//被删除的元素会被返回（0索引：bbb）
        System.out.println(str);

        System.out.println("=================");

        //4.修改元素

        System.out.println(list);
        String result0 =list.set(1,"mmm");
        System.out.println(result0);//返回原来的元素
        System.out.println(list);

        System.out.println("==============");
        //5.查询元素
        String s=list.get(0);
        System.out.println(s);

        System.out.println("============");

        //6.遍历元素
        //list.size():集合长度（元素个数）
        for (int i = 0; i < list.size(); i++) {//快捷键：list.fori
            //i   索引
            //list.get(i)   元素
            String str1=list.get(i);
            System.out.println(str1);
        }
    }
}
