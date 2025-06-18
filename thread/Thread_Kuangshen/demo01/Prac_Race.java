package Thread_Kuangshen.demo01;
//练习：模拟龟兔赛跑
public class Prac_Race implements Runnable{
    //胜利者
    private static String winner;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {

            //模拟兔子睡觉
            if (Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag=gameOver(i);
            //如果比赛结束，就停止程序
            if (flag){
                System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
                System.out.println("winner is"+winner);
                System.exit(0);
            }else {
                System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
            }



        }
    }

    //判断是否完成比赛
    private boolean gameOver(int steps){
        //判断是否有胜利者
        if (winner != null){//已经存在胜利者了
            return true;
        }else{
            if(steps==100){
                winner=Thread.currentThread().getName();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Thread(new Prac_Race(),"兔子").start();
        new Thread(new Prac_Race(),"乌龟").start();
    }
}
