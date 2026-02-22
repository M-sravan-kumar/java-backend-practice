package executorintro;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int i=0;i<10;i++)
        {
            if(i==4|| i==1)
                System.out.println("DEBUG");
            PrintNumber num = new PrintNumber(i);
            executor.execute(num);
        }

        executor.shutdown();
    }
}
