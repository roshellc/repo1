package com.mycom.test;

public class threadtest {

    public static void main(String[] args) {
        System.out.println("主方法执行");
        testThread testThread = new testThread();

        Thread thread = new Thread(testThread);
        thread.start();
        try {
            Thread.sleep(3000);
            testThread.flag=false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主方法结束");
    }

    static class testThread extends Thread{
        public boolean flag = true;

        public void run(){
            System.out.println("线程run()执行");
            while (flag){
                synchronized (this){}
            }
            System.out.println("线程run()结束");
        }

    }
}
