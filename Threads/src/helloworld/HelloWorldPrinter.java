package helloworld;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from a different thread"+
                    Thread.currentThread().getName() );
    }
}
