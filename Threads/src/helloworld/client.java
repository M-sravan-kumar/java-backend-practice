package helloworld;

public class client {

    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        System.out.println("printing from thread:- "+
                   thread.currentThread().getName() );
    }
}
