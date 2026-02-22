package print1to100;

import helloworld.HelloWorldPrinter;

public class client {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){

            if(i==2 || i==8)
                System.out.println("DEBUG");
            PrintNumber printNumber = new PrintNumber(i);
            Thread thread = new Thread(printNumber);
            thread.start();

        }
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }
}
