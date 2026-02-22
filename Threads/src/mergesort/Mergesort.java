package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mergesort implements Callable<List<Integer>> {
    private List<Integer> arr;

    private ExecutorService executorService;

    public Mergesort(List<Integer> array,ExecutorService executorService){
        arr = array;
        this.executorService=executorService;
    }


    @Override
    public List<Integer> call() throws Exception {

//        ExecutorService executor = Executors.newCachedThreadPool();

        int k = arr.size();

        if(k<=1)
            return arr;
        int mid = k/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++)
        {
            leftArray.add(arr.get(i));
        }
        for(int i=mid;i<k;i++)
        {
            rightArray.add(arr.get(i));
        }

        int i=0;
        int j=0;

        Mergesort left =  new Mergesort(leftArray,executorService);
        Mergesort right =  new Mergesort(rightArray,executorService);

        Future<List<Integer>> leftSortedArrayFuture =  executorService.submit(left);
        Future<List<Integer>> rightSortedArrayFuture =  executorService.submit(right);

//        List<Integer> leftSortedArray  = left.call();
//        List<Integer> rightSortedArray  = right.call();

        int n = leftArray.size();
        int m = rightArray.size();
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        while(i<n && j<m)
        {
            if(leftSortedArray.get(i) <= rightSortedArray.get(j))
            {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else if(leftSortedArray.get(i) > rightSortedArray.get(j))
            {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while(i<n) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<m)
        {
            sortedArray.add((rightSortedArray.get(j)));
            j++;
        }
        return sortedArray;

    }
}
