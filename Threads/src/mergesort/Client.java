package mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer> arr = List.of(12,14,15,11);
        int n = arr.size();
        Mergesort mergeSort = new Mergesort(arr,executorService);
        Future<List<Integer>> res = executorService.submit(mergeSort);
        System.out.println(res.get());
        executorService.shutdown();
    }
}
