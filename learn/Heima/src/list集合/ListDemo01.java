package list集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo01 {
    public static void main(String[] args) {
        //目标：掌握List系列集合独有的功能
        List<String> names=new ArrayList<>();//一行经典代码，体现了多态

        //添加数据
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        System.out.println(names);//[张三, 李四, 王五, 赵六]

        //给第三个位置插入一个数据：赵敏
        names.add(2,"赵敏");
        System.out.println(names);

        //删除李四
        names.remove(1);//返回值是李四
        //也可写成：names.remove("李四");
        System.out.println(names);

        //把王五修改成金毛
        names.set(2,"金毛");
        System.out.println(names);

        //获取张三
        System.out.println(names.get(0));

//List集合的四种遍历方式
        System.out.println("====================");
        //1.for循环
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("------");
        //2.迭代器遍历
        Iterator<String> it = names.iterator();//输入names.iterator.var按回车
        while(it.hasNext()){
            String name=it.next();
            System.out.println(name);
        }
        System.out.println("-------");

        //3.增强for
        for (String name : names) {//names.for按回车
            System.out.println(name);
        }
        System.out.println("---------");

        //4.lambda表达式
       names.forEach(name-> System.out.println(name));
    }
}
