package synchronization;

public class Count {
    private int value = 0;

    synchronized void increment()
    {
        this.value+=1;
    }
    synchronized void decrement()
    {
        this.value-=1;
    }

    int getValue(){
        return value;
    }
}
