import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Thread02 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<50;i++)
         System.out.println(Thread.currentThread().getName());
    }
}
