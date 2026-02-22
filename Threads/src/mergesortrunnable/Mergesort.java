package mergesortrunnable;

import java.util.ArrayList;
import java.util.List;

public class Mergesort implements Runnable{

    List<Integer> arr;
    int s;
    int e;

    public Mergesort(List<Integer> v, int start ,int end)
    {
        arr = v;
        s = start;
        e = end;
    }

    @Override
    public void run() {
        if(s==e)
            return;
        int mid = (s+e)/2;
        Mergesort left = new Mergesort(arr,s,mid);
        Mergesort right = new Mergesort(arr,mid+1,e);
        left.run();
        right.run();

        int i=s;
        int j=mid+1;
        int n = mid;
        int m = e;
        List<Integer> res = new ArrayList<>();
        while (i<=n && j<=m)
        {
            if(arr.get(i) <= arr.get(j)){
             res.add(arr.get(i));  
             i++;
            }
            else
            {
                res.add(arr.get(j));
                j++;
            }
        }

        while (i<=n)
        {
            res.add(arr.get(i));
            i++;
        }

        while ((j<=m))
        {
            res.add(arr.get(j));
            j++;
        }

        for (int k = 0; k < res.size() ; k++) {
            arr.set(s+k, res.get(k));

        }

    }
}
