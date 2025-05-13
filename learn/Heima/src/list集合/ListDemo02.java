package list集合;

import java.util.LinkedList;

public class ListDemo02 {
    public static void main(String[] args) {
        //目标：用LinkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.add("赵敏");
        queue.add("西门吹雪");
        queue.add("陆小凤");
        queue.add("石观音");
        System.out.println(queue);//[赵敏, 西门吹雪, 陆小凤, 石观音]

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("-----------------");
        //做一个栈
        LinkedList<String> stack=new LinkedList<>();
        //压栈
        stack.push("第一颗子弹");//push就是addFirst
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        System.out.println(stack);//[第四颗子弹, 第三颗子弹, 第二颗子弹, 第一颗子弹]

        //出栈
        System.out.println(stack.pop());//pop就是removeFirst
        System.out.println(stack.removeFirst());
        System.out.println(stack);
    }
}
