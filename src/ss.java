public class ss  {


    public static void main(String[] args) {
        Thread02 thread02 = new Thread02();
        Thread.currentThread().setName("main");
        Thread th = new Thread(thread02,"用户");
        th.start();
        for(int i=0;i<50;i++){
short
            System.out.println("main");
        }
    }



}