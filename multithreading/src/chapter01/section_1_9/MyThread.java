package chapter01.section_1_9;

/**
 * yield:放弃当期cpu资源
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时: " + (endTime - beginTime) + " 毫秒");
    }
}
