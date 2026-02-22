package mergesortrunnable;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Integer> arr = List.of(5,4,9,1,2,10,3,8,6,9,7);
        int n = arr.size();

        Mergesort mergesort = new Mergesort(arr,0,n-1);

        mergesort.run();

        System.out.println(arr);

    }
}
