public class Demo {
    public static void main(String[] args) {
        Thread01 th1 = new Thread01();
        Thread thread1 = new Thread(th1,"黄牛");
        Thread thread2 = new Thread(th1,"aaa");
        Thread thread3 = new Thread(th1,"ccc");
        thread1.start();
        thread2.start();
        thread3.start();
        sout"g123";

    }
}
