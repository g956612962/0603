public class Thread01 implements Runnable{
    private int cnt = 0;
    private int sum = 10;

    @Override
    public void run() {

            while (!Thread.currentThread().isInterrupted()) {

                synchronized (this) {
                if (sum == 0) {
                    break;
                }
                    cnt++;
                    sum--;
                    System.out.println(Thread.currentThread().getName() + "抢到了第" + cnt + "票,剩余"+sum+"票");
                try {
                    if (Thread.currentThread().getName().equals("黄牛")){
                        Thread.currentThread().interrupt();
                        if(Thread.currentThread().isInterrupted())
                            throw  new InterruptedException("");
                    }
                    Thread.sleep(1000);


                } catch (InterruptedException e) {

                }


            }
        }
    }


    /*public synchronized void a() {
        while (true) {
            if (sum == 0) {
                break;
            }
            cnt++;
            sum--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第" + cnt + "票");
        }
    }*/
}