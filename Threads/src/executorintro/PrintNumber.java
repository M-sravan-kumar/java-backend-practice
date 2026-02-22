package executorintro;

public class PrintNumber implements Runnable {

    private int num;
    public PrintNumber(int x) {
        num = x;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +":" +num);
    }
}
